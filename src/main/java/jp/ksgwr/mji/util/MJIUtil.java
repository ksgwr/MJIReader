package jp.ksgwr.mji.util;

public class MJIUtil {

    /**
     * convert UCS integer from string
     * @param ucs ucs string(ex. U+FFFF)
     * @return ucs integer
     * @return ucs integer
     */
    public static int convertUCS(String ucs) {
        if (ucs.startsWith("U+")) {
            return Integer.parseInt(ucs.substring(2), 16);
        } else {
            return -1;
        }
    }

    /**
     * convert string (character) from ucs codePoint
     * @param codePoint ucs codePoint
     * @return string (character)
     */
    public static String convertString(int codePoint) {
        return new String(Character.toChars(codePoint));
    }

    /**
     *
     * @param ucs ucs string(ex. U+FFFF)
     * @return string (character)
     */
    public static String convertString(String ucs) {
        if (ucs.startsWith("U+")) {
            return convertString(Integer.parseInt(ucs.substring(2), 16));
        } else {
            return null;
        }
    }

    /**
     * convert MJCode integer from string
     * @param mjCode MJCode string(ex. MJ000001)
     * @return MJCode integer
     */
    public static int convertMJCodeAsInteger(String mjCode) {
        if (mjCode.startsWith("MJ")) {
            return Integer.valueOf(mjCode.substring(2));
        } else {
            return 0;
        }
    }
}
