package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        // kalau pakai HashSet data yang dimasukkan tidak akan berurutan
        // Set<String> names = new HashSet<>();
        // kalau pakai LinkedHashSet data yang dimasukkan akan berurutan
        Set<String> names = new LinkedHashSet<>();
        names.add("Didik");
        names.add("Nur");
        names.add("Hidayat");
        names.add("Didik");
        names.add("Nur");
        names.add("Hidayat");

        for (var value : names) {
            System.out.println(value);
        }
    }
}
