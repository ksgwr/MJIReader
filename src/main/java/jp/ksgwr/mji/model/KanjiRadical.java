package jp.ksgwr.mji.model;

import mojikiban.ipa.go.jp.mji.MJ文字情報;

public class KanjiRadical {

    protected final MJ文字情報.部首内画数 radical;

    public KanjiRadical(MJ文字情報.部首内画数 radical) {
        this.radical = radical;
    }

    public int getInternalStrokeCount() {
        return radical.get内画数().intValue();
    }

    public int getRadicalNumber() {
        return radical.get部首();
    }
}
