package jp.ksgwr.mji;

import com.google.gson.Gson;
import jp.ksgwr.mji.model.*;
import jp.ksgwr.mji.util.MJIUtil;
import mojikiban.ipa.go.jp.mji.MJ文字情報;
import mojikiban.ipa.go.jp.mji.MJ文字情報一覧表;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class MJIReader {

    private static final float MJSU_MAP_RATIO = 0.6f;

    private static final float MJI_MAP_RATIO = 1.2f;

    private static final float MJSHRINKCONTENT_MAP_RATIO = 1.2f;

    private static final Gson GSON = new Gson();

    public static MJTable createInstance() throws JAXBException {
        ClassLoader classLoader = MJIReader.class.getClassLoader();
        return createInstance(classLoader.getResourceAsStream("mji.00502/mji.00502.xml"),
                classLoader.getResourceAsStream("MJShrinkMap.1.2.0.json"),
                classLoader.getResourceAsStream("MJSU.1.2.0.json"));
    }

    public static MJTable createInstance(InputStream mji, InputStream mjshrink, InputStream mjsu) throws JAXBException {

        Map<String, MJShrink> mjShrinkMap;
        if (mjshrink != null) {
            mjShrinkMap = createMJShrinkContentMap(mjshrink);
        } else {
            mjShrinkMap = null;
        }

        Map<String, Integer> mjsuMap;
        if (mjsu != null) {
            mjsuMap = createMJSUMap(mjsu);
        } else {
            mjsuMap = null;
        }

        JAXBContext context = JAXBContext.newInstance(MJ文字情報一覧表.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        MJ文字情報一覧表 root = (MJ文字情報一覧表) unmarshaller.unmarshal(mji);
        List<MJ文字情報> list = root.getMJ文字情報();

        Map<Integer, List<MJItem>> items = new LinkedHashMap<>(Math.round(list.size() * MJI_MAP_RATIO));

        for (MJ文字情報 x : list) {
            MJ文字情報.UCS.対応するUCS ucs = x.getUCS().get対応するUCS();
            if (ucs != null) {
                int ucsCode = MJIUtil.convertUCS(ucs.getValue());
                if (ucsCode < 0) {
                    continue;
                }

                MJShrink shrink = null;
                if (mjShrinkMap != null) {
                    shrink = mjShrinkMap.get(x.getMJ文字図形名());
                }

                Integer normalizedUCS = null;
                if (mjsuMap != null) {
                    normalizedUCS = mjsuMap.get(x.getMJ文字図形名());
                    if (normalizedUCS != null && ucsCode == normalizedUCS) {
                        normalizedUCS = null;
                    }
                }

                List<MJItem> mjitems = items.get(ucsCode);
                if (mjitems == null) {
                    mjitems = new ArrayList<MJItem>(1);
                }
                mjitems.add(new MJItem(x, shrink, normalizedUCS));
                items.put(ucsCode, mjitems);
            }
        }

        return new MJTable(items);
    }

    /**
     * create MJSU Map
     * @param mjsu MJSU.1.2.0.json
     * @return MJCode, UCS codePoint mapping
     */
    public static Map<String, Integer> createMJSUMap(InputStream mjsu) {
        MJSU root = GSON.fromJson(new InputStreamReader(mjsu), MJSU.class);

        Map<String, Integer> map = new HashMap<>(Math.round(root.content.size() * MJSU_MAP_RATIO));
        for (MJSU.Content item: root.content) {
            if (!MJSU.NO_NORMALIZED.equals(item.note)) {
                map.put(item.mjCode, MJIUtil.convertUCS(item.normalized.ucs));
            }
        }

        return map;
    }

    /**
     * create MJShrinkContent Map
     * @param input MJShrinkMap.1.2.0.json
     * @return MJCode, MJShrink Object
     */
    public static Map<String, MJShrink> createMJShrinkContentMap(InputStream input) {
        MJShrinkDTO root = GSON.fromJson(new InputStreamReader(input), MJShrinkDTO.class);

        Map<String, MJShrink> map = new HashMap<>(Math.round(root.content.size() * MJSHRINKCONTENT_MAP_RATIO));
        for (MJShrink item: root.content) {
            if (!item.isEmpty()) {
                map.put(item.mjCode, item);
            }
        }
        return map;
    }
}
