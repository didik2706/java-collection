package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {
        // example immutable List
        List<String> one = Collections.singletonList("One Data");
        List<String> empty = Collections.emptyList();

        // example mutable List
        List<String> mutable = new ArrayList<>();
        mutable.add("Didik");
        mutable.add("Nur");
        mutable.add("Hidayat");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("Didik", "Nur", "Hidayat");
        elements.add("Jokowi"); // ERROR CODE because try to modified immutable List
    }
}
