package jp.ksgwr.mji;

import java.text.Normalizer;

public class NormalizerTest {

    public static void main(String[] args) {
        System.out.println(Normalizer.normalize("㈱", Normalizer.Form.NFKC));
    }
}
