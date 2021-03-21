package com.company;

import java.util.Comparator;

public class PersonCompareByBirthDate implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getM_birth_date().compareTo(o2.getM_birth_date());
    }
}
