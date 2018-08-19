package jp.ksgwr.mji.model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class MJShrinkTest {

    @Test
    public void getCandidatesTest() {
        MJShrink mjShrink = new MJShrink();
        MJShrink.JisUcsUnified item = new MJShrink.JisUcsUnified();
        item.ucsCode = "U+9F4B";
        mjShrink.jisUcsUnifiedList = new ArrayList<MJShrink.JisUcsUnified>() {{
            add(item);
        }};

        TreeSet<Integer> candidates = mjShrink.getCandidates();

        assertNotNull(candidates);
        assertFalse(candidates.isEmpty());
    }
}
