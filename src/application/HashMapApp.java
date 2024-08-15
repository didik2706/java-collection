package application;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name.first", "Didik");
        map.put("name.middle", "Nur");
        map.put("name.last", "Hidayat");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.middle"));
        System.out.println(map.get("name.last"));
    }
}
