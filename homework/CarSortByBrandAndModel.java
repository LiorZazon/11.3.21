package com.company;

import java.util.Comparator;

public class CarSortByBrandAndModel implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getM_brand().equals(o2.getM_brand())) {
            return o1.getM_model().compareTo(o2.getM_model());
        } else {
            return o1.getM_brand().compareTo(o2.getM_brand());
        }
    }
}
