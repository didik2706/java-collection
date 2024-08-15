package application;

import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Didik", "Nur", "Hidayat");

        for (var name : names) {
            System.out.println(name);
        }

        // use iterator
        System.out.println("==== Iterator ====");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
