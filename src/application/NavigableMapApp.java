package application;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("name1", "Didik");
        map.put("name2", "Didik");
        map.put("name3", "Didik");

        for (var key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.lowerKey("name2"));
        System.out.println(map.higherKey("name2"));
        System.out.println(map.floorKey("name2"));
        System.out.println(map.ceilingKey("name2"));

        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (var key : mapDesc.keySet()) {
            System.out.println(key);
        }

        // immutable NavigableMap
        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

    }
}
