package jp.ksgwr.mji.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MJSU {

    public static final String NO_NORMALIZED = "候補なし";

    public List<Content> content;

    public static class Content {

        @SerializedName("MJ文字図形名")
        public String mjCode;

        @SerializedName("変換先")
        public Normalized normalized;

        @SerializedName("備考")
        public String note;
    }

    public static class Normalized {

        @SerializedName("JIS X 0213")
        public String jis;

        @SerializedName("UCS")
        public String ucs;
    }
}
