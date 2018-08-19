package jp.ksgwr.mji.cli;

import jp.ksgwr.mji.MJIReader;
import jp.ksgwr.mji.model.JISX0213;
import jp.ksgwr.mji.model.MJItem;
import jp.ksgwr.mji.model.MJShrink;
import jp.ksgwr.mji.model.MJTable;

import javax.xml.bind.JAXBException;
import java.io.*;
import java.util.*;

/**
 * JIS第一水準・第二水準の文字で常用漢字またはより単純な漢字が縮退候補にある場合にその候補を抽出します。
 */
public class ExtractMinimumCommonNormalizerMap {

    public static void main(String[] args) throws JAXBException {
        if (args.length != 1) {
            System.err.println("set output file path");
            System.exit(-1);
        }

        MJTable mjTable = MJIReader.createInstance();
        LinkedHashMap<String, String> buffs = new LinkedHashMap<>();

        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(args[0])), "UTF-8"))) {
            for (List<MJItem> items : mjTable.values()) {
                for (MJItem item : items) {
                    JISX0213 jis = item.getJISX0213();
                    if (jis == null) {
                        continue;
                    }
                    Integer jisLevel = jis.getMenkutenLevel();
                    if (jisLevel == null || jisLevel > 2) {
                        continue;
                    }

                    MJShrink shrink = item.getShrink();
                    if (shrink == null) {
                        continue;
                    }
                    TreeSet<Integer> candidates = shrink.getCandidates();
                    if (candidates == null) {
                        continue;
                    }

                    if (item.isCommonlyUsedCharacter()) {
                        continue;
                    }

                    MJItem normalizedItem = item;
                    for (Integer codePoint : candidates) {
                        List<MJItem> candidateList = mjTable.getItem(codePoint);
                        if (candidateList != null) {
                            for (MJItem candidate : candidateList) {
                                if (candidate.isCommonlyUsedCharacter()) {
                                    normalizedItem = candidate;
                                    break;
                                } else if (candidate.canUsePersonName() && !normalizedItem.canUsePersonName()) {
                                    normalizedItem = candidate;
                                } else if (Optional.ofNullable(candidate.getJISX0213()).map(x -> x.getMenkutenLevel()).orElse(5)
                                        < Optional.ofNullable(normalizedItem.getJISX0213()).map(x -> x.getMenkutenLevel()).orElse(5)) {
                                    normalizedItem = candidate;
                                }
                            }
                        }
                    }
                    if (normalizedItem.getCharacter().equals(item.getCharacter())) {
                        continue;
                    }
                    String normalizedCharacter = normalizedItem.getCharacter();
                    if (normalizedCharacter == null) {
                        continue;
                    }

                    String character = item.getCharacter();
                    if (character == null) {
                        continue;
                    }

                    buffs.put(character + "\t" + normalizedCharacter, "\t" + item.getMJCode() + "\n");


                }
                for (Map.Entry<String, String> entry : buffs.entrySet()) {
                    bw.write(entry.getKey() + entry.getValue());
                }
                buffs.clear();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
