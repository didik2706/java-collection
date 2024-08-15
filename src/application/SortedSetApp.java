package application;

import data.Person;
import data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator());

        people.add(new Person("Didik"));
        people.add(new Person("Nur"));
        people.add(new Person("Hidayat"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        SortedSet<Person> people1 = Collections.unmodifiableSortedSet(people);
        people1.add(new Person("Didik")); // ERROR karna people1 bersifat immutable
    }
}
