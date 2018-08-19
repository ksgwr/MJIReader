package jp.ksgwr.mji.model;

import jp.ksgwr.mji.util.MJIUtil;
import mojikiban.ipa.go.jp.mji.MJ文字情報;

import java.util.ArrayList;
import java.util.List;

public class MJItem {

    protected final MJ文字情報 item;

    protected final Integer normalizedUCS;

    protected final MJShrink shrink;

    protected final String character;

    protected final String normalizedCharacter;

    protected final List<KanjiRadical> kanjiRadicals;

    public MJItem(MJ文字情報 item, MJShrink shrink, Integer normalizedUCS) {
        this.item = item;
        this.shrink = shrink;
        this.normalizedUCS = normalizedUCS;
        this.character = createCharacter();
        this.normalizedCharacter = createNormalizedCharacter();
        this.kanjiRadicals = createKanjiRadicals();
    }

    public String getMJCode() {
        return item.getMJ文字図形名();
    }

    private String createCharacter() {
        MJ文字情報.UCS.対応するUCS ucs = item.getUCS().get対応するUCS();
        if (ucs != null) {
            return MJIUtil.convertString(ucs.getValue());
        } else {
            return null;
        }
    }

    public String getCharacter() {
        return character;
    }

    private String createNormalizedCharacter() {
        if (normalizedUCS != null) {
            return MJIUtil.convertString(normalizedUCS);
        } else {
            return null;
        }
    }

    public String getNormalizedCharacter() {
        return normalizedCharacter;
    }

    public String getFamilyRegisterUnifiedCharacterNumber() {
        return item.get戸籍統一文字番号();
    }

    public String getResidentRegistryNetworkUnifiedCharacterCode() {
        return item.get住基ネット統一文字コード();
    }

    public String getImmigrationOrthographicCode() {
        return item.get入管正字コード();
    }

    public String getImmigrationExternalCharacterCode() {
        return item.get入管外字コード();
    }

    public boolean canUsePersonName() {
        return item.get漢字施策().is人名用漢字();
    }

    public boolean isCommonlyUsedCharacter() {
        return item.get漢字施策().is常用漢字();
    }

    public JISX0213 getJISX0213() {
        MJ文字情報.JISX0213 tmp = item.getJISX0213();
        if (tmp != null) {
            return new JISX0213(tmp);
        } else {
            return null;
        }
    }

    public int getStrokeCount() {
        return item.get総画数().intValue();
    }

    public List<KanjiRadical> createKanjiRadicals() {
        List<MJ文字情報.部首内画数> tmp = item.get部首内画数();
        if (tmp != null) {
            List<KanjiRadical> kanjiRadicals = new ArrayList<>(tmp.size());
            for (MJ文字情報.部首内画数 x : tmp) {
                kanjiRadicals.add(new KanjiRadical(x));
            }
            return kanjiRadicals;
        } else {
            return null;
        }
    }

    public List<KanjiRadical> getKanjiRadicals() {
        return kanjiRadicals;
    }

    public List<String> getKunYomi() {
        return item.get読み().get訓読み();
    }

    public List<String> getOnyomi() {
        return item.get読み().get音読み();
    }

    public MJShrink getShrink() {
        return shrink;
    }

    public String toString() {
        return "[" + item.getMJ文字図形名() + "]" + getCharacter() + "(" + getNormalizedCharacter() + ")";
    }
}
