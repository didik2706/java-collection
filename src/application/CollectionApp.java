package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Didik");
        collection.add("Nur");
        collection.add("Hidayat");
        collection.addAll(Arrays.asList("Backend", "Engineer"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("Remove Data");
        collection.remove("Didik");
        collection.removeAll(List.of("Engineer", "Hidayat"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println(collection.contains("Nur"));
        System.out.println(collection.containsAll(List.of("Nur", "Didik")));
    }
}
