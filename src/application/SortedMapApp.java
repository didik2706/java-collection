package application;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator);

        sortedMap.put("first", "Didik");
        sortedMap.put("middle", "Nur");
        sortedMap.put("last", "Hidayat");

        for (var key : sortedMap.keySet()) {
            System.out.println(key);
            System.out.println(sortedMap.get(key));
        }

        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);
//        immutable.put("test", "test");
    }
}
