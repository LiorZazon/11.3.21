package com.company;

import java.util.Comparator;

public class PersonCompareById implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        return o1.getM_id().compareTo(o2.getM_id());
    }
}
