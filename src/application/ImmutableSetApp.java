package application;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Test");

        Set<String> mutable = new HashSet<>();
        mutable.add("Didik");
        mutable.add("Nur");
        mutable.add("Hidayat");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Didik", "Nur");
        set.add("Hidayat"); // ERROR CODE karena mencoba untuk merubaha immutable set
    }
}
