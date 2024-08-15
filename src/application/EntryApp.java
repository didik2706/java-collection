package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("name1", "test1");
        map.put("name2", "test2");
        map.put("name3", "test3");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (var entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
