package application;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
//        List<String> strings = new LinkedList<>();


        strings.add("Didik");
        strings.add("Nur");
        strings.add("Hidayat");

        strings.set(1, "Nur");

        strings.remove(1);
        System.out.println(strings.get(0));

        for(var value : strings) {
            System.out.println(value);
        }
    }
}
