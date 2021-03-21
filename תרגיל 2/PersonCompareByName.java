package com.company;

import java.util.Comparator;

public class PersonCompareByName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getM_name().compareTo(o2.getM_name());
    }
}
