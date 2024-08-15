package application;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Didik", "Nur", "Hidayat"));

        NavigableSet<String> namesReversed = names.descendingSet();
        NavigableSet<String> dzun = names.tailSet("Dzun", true);

        for (var name : dzun) {
            System.out.println(name);
        }

        // immutable navigable set
        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        immutable.add("Test");
    }
}
