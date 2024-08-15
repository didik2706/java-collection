package application;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class MapDefaultMethodApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name1", "Didik1");
        map.put("name2", "Didik2");
        map.put("name3", "Didik3");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + " " + s2);
            }
        });

        map.replaceAll(new BiFunction<String, String, String>() {
            @Override
            public String apply(String s, String s2) {
                return "apapun";
            }
        });
        System.out.println(map);
    }
}
