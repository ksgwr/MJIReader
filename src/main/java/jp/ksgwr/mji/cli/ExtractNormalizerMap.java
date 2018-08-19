package jp.ksgwr.mji.cli;

import jp.ksgwr.mji.MJIReader;
import jp.ksgwr.mji.model.MJItem;
import jp.ksgwr.mji.model.MJTable;

import javax.xml.bind.JAXBException;
import java.io.*;
import java.util.List;

/**
 * IPAで提供された縮退マップに基づき一意の正規化ルールを抽出します。
 */
public class ExtractNormalizerMap {

    public static void main(String[] args) throws JAXBException, IOException {
        if (args.length != 1) {
            System.err.println("set output file path");
            System.exit(-1);
        }

        MJTable mjTable = MJIReader.createInstance();

        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(args[0])), "UTF-8"))) {
            for (List<MJItem> items : mjTable.values()) {
                for (MJItem item : items) {
                    String normalizedCharacter = item.getNormalizedCharacter();
                    String character = item.getCharacter();
                    if (normalizedCharacter != null && character != null) {
                        String line = character + "\t" + normalizedCharacter + "\t" + item.getMJCode() + "\n";
                        bw.write(line);
                    }
                }
            }
        }
    }
}
