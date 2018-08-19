package jp.ksgwr.mji.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class MJIUtilTest {

    @Test
    public void convertUCSTest1() {
        String ucs = "U+303B";

        Integer actual = MJIUtil.convertUCS(ucs);

        assertEquals(12347, actual.intValue());
    }

    @Test
    public void convertUCSTest2() {
        String ucs = "";

        int actual = MJIUtil.convertUCS(ucs);

        assertEquals(-1, actual);
    }

    @Test
    public void convertStringTestFromInteger() {
        int ucsCodePoint = 12347;

        String actual = MJIUtil.convertString(ucsCodePoint);

        assertEquals("〻", actual);
    }

    @Test
    public void convertStringTestFromString() {
        String ucs = "U+303B";

        String actual = MJIUtil.convertString(ucs);

        assertEquals("〻", actual);
    }

    @Test
    public void convertMJCodeAsIntegerTest() {
        String mjCode = "MJ000003";

        int actual = MJIUtil.convertMJCodeAsInteger(mjCode);

        assertEquals(3, actual);
    }
}