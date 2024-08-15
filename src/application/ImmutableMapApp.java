package application;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "Didik");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Didik");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);
        immutable.put("age", "24"); // ERROR CODE

        Map<String, String> map = Map.of(
                "first", "Didik",
                "middle", "Nur",
                "last", "Hidayat"
        );
    }
}
