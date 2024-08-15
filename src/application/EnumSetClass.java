package application;

import java.util.EnumSet;

public class EnumSetClass {
    public static enum Gender {
        MALE, FEMALE, NOT_MENTION
    }

    public static void main(String[] args) {
        // ini untuk memasukkan semua enum
        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
        for (var gender : genders) {
            System.out.println(gender);
        }

        // ini untuk memasukkan beberapa enum
        EnumSet<Gender> genders1 = EnumSet.of(Gender.MALE, Gender.FEMALE);
        for (var gender : genders1) {
            System.out.println(gender);
        }
    }
}
