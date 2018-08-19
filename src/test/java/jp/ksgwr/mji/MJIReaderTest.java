package jp.ksgwr.mji;

import jp.ksgwr.mji.model.MJShrink;
import jp.ksgwr.mji.model.MJShrinkDTO;
import jp.ksgwr.mji.model.MJTable;
import org.junit.Test;

import javax.xml.bind.JAXBException;
import java.io.InputStream;
import java.util.Map;

import static org.junit.Assert.*;

public class MJIReaderTest {

    @Test
    public void createMJSUMapTest() {
        InputStream input = MJIReader.class.getClassLoader().getResourceAsStream("MJSU.1.2.0.json");

        Map<String, Integer> actual = MJIReader.createMJSUMap(input);

        assertEquals(27597, actual.size());
    }

    @Test
    public void createMJShrinkContentTest() {
        InputStream input = MJIReader.class.getClassLoader().getResourceAsStream("MJShrinkMap.1.2.0.json");

        Map<String, MJShrink> actual = MJIReader.createMJShrinkContentMap(input);

        assertEquals(35851, actual.size());
    }

    @Test
    public void createMJTable() throws JAXBException {
        MJTable mjTable = MJIReader.createInstance();

        assertEquals(52516, mjTable.values().size());
    }
}
