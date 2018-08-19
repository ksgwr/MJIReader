package jp.ksgwr.mji.model;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MJTable {

    protected final Map<Integer, List<MJItem>> items;

    public MJTable(Map<Integer, List<MJItem>> items) {
        this.items = items;
    }

    public List<MJItem> getItem(int codePoint) {
        return items.get(codePoint);
    }

    public List<MJItem> getItem(char c) {
        return items.get(c);
    }

    public List<MJItem> getItem(String str) {
        return items.get(str.codePointAt(0));
    }

    public Collection<Integer> keySet() {
        return items.keySet();
    }

    public Collection<List<MJItem>> values() {
        return items.values();
    }

    public Set<Map.Entry<Integer, List<MJItem>>> entriySet() {
        return items.entrySet();
    }
}
