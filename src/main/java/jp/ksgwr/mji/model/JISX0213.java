package jp.ksgwr.mji.model;

import mojikiban.ipa.go.jp.mji.MJ文字情報;

import java.util.List;

public class JISX0213 {

    protected final MJ文字情報.JISX0213 item;

    public JISX0213(MJ文字情報.JISX0213 item) {
        this.item = item;
    }

    /**
     * 包摂区分欄には、「0」「2」の2種を記した。
     * 「0」は、該当する文字がJIS X 0213:2012規格票の例示する字体に相当する字形であることを示す。
     * 「2」は、該当する文字がJIS X 0213:2012の包摂規準を適用できる字体に相当する字形であることを示す。
     *
     * @return 包摂区分
     */
    public Integer getSubsumptionDivison() {
        return Integer.valueOf(item.get包摂区分());
    }

    public List<String> getSubsumptionSerialNumber() {
        return item.get包摂連番();
    }

    public String getMenkutenNumber() {
        MJ文字情報.JISX0213.面区点位置 tmp = item.get面区点位置();
        if (tmp != null) {
            return tmp.getValue();
        } else {
            return null;
        }
    }

    public Integer getMenkutenLevel() {
        MJ文字情報.JISX0213.面区点位置 tmp = item.get面区点位置();
        if (tmp != null) {
            return Integer.valueOf(tmp.get水準());
        } else {
            return null;
        }
    }
}
