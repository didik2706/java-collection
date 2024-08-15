package application;

import data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Didik");

        // add hobbies
        person.addHobbies("Game");
        person.addHobbies("Watching Anime");

        doSomethinkWithHobbies(person.getHobbies());

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethinkWithHobbies(List<String> hobbies) {
        hobbies.add("test");
    }
}
