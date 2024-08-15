package application;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public synchronized static void main(String[] args) {
        List<String> list = new Vector<>();

        list.add("name1");
        list.add("name2");
        list.add("name3");

        for (var value : list) {
            System.out.println(value);
        }
    }
}
