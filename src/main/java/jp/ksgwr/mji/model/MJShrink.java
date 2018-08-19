package jp.ksgwr.mji.model;

import com.google.gson.annotations.SerializedName;
import jp.ksgwr.mji.util.MJIUtil;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static java.util.Optional.ofNullable;

public class MJShrink {

    @SerializedName("MJ文字図形名")
    public String mjCode;

    @SerializedName("JIS包摂規準・UCS統合規則")
    public List<JisUcsUnified> jisUcsUnifiedList;

    @SerializedName("法務省戸籍法関連通達・通知")
    public List<FamilyRegistrationRawUnified> familyRegistrationRawUnifiedList;

    @SerializedName("法務省告示582号別表第四")
    public List<MinistryOfJusticeNotice> ministryOfJusticeNotices;

    @SerializedName("辞書類等による関連字")
    public List<JisUcsUnified> relatedCharacters;

    @SerializedName("読み・字形による類推")
    public List<JisUcsUnified> estimationCharacters;

    public boolean isEmpty() {
        return jisUcsUnifiedList == null
                && familyRegistrationRawUnifiedList == null
                && ministryOfJusticeNotices == null
                && relatedCharacters == null
                && estimationCharacters == null;
    }

    public TreeSet<Integer> getCandidates() {
        TreeSet<Integer> candidates = new TreeSet();
        candidates.addAll(ofNullable(jisUcsUnifiedList).orElse(Collections.emptyList()).stream().map(x -> MJIUtil.convertUCS(x.ucsCode)).filter(x -> x >= 0).collect(Collectors.toList()));
        candidates.addAll(ofNullable(familyRegistrationRawUnifiedList).orElse(Collections.emptyList()).stream().map(x -> MJIUtil.convertUCS(x.ucsCode)).filter(x -> x >= 0).collect(Collectors.toList()));
        candidates.addAll(ofNullable(ministryOfJusticeNotices).orElse(Collections.emptyList()).stream().map(x -> MJIUtil.convertUCS(x.ucsCode)).filter(x -> x >= 0).collect(Collectors.toList()));
        candidates.addAll(ofNullable(relatedCharacters).orElse(Collections.emptyList()).stream().map(x -> MJIUtil.convertUCS(x.ucsCode)).filter(x -> x >= 0).collect(Collectors.toList()));
        candidates.addAll(ofNullable(estimationCharacters).orElse(Collections.emptyList()).stream().map(x -> MJIUtil.convertUCS(x.ucsCode)).filter(x -> x >= 0).collect(Collectors.toList()));
        return candidates.isEmpty() ? null : candidates;
    }

    public static class JisUcsUnified {

        @SerializedName("JIS X 0213")
        public String jisCode;

        @SerializedName("UCS")
        public String ucsCode;

    }

    public static class FamilyRegistrationRawUnified extends JisUcsUnified {
        @SerializedName("種別")
        public String type;

        @SerializedName("ホップ数")
        public Integer hop;
    }

    public static class MinistryOfJusticeNotice extends JisUcsUnified {
        @SerializedName("表")
        public String table;

        @SerializedName("順位")
        public String rank;
    }
}
