package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Create ArrayList of cars
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("69-875-23", "suzuki", "sx4", LocalDateTime.of(2009, 5, 16, 0, 0, 0), "white", 5));
        cars.add(new Car("65-225-21", "lamborgini", "veneno", LocalDateTime.of(2020, 9, 14, 0, 0, 0), "silver", 2));
        cars.add(new Car("79-545-24", "ferrari", "458", LocalDateTime.of(2016, 1, 31, 0, 0, 0), "red", 5));
        cars.add(new Car("78-275-263", "nissan", "centra", LocalDateTime.of(2010, 8, 7, 0, 0, 0), "gray", 5));
        cars.add(new Car("689-85-253", "renault", "megane", LocalDateTime.of(2013, 2, 26, 0, 0, 0), "black", 7));


        //Sort using each type and print after EACH sort
        System.out.println("==============before sort================");
        for (int index = 0; index < cars.size(); index++) {
            System.out.println(cars.get(index));
        }

        Collections.sort(cars);

        System.out.println("after sort by ID");

        for (int index = 0; index < cars.size(); index++) {
            System.out.println(cars.get(index));
        }

        Collections.sort(cars, new CarSortByBrandAndModel());
        System.out.println("after sort by brand and model");
        for (int index = 0; index < cars.size(); index++) {
            System.out.println(cars.get(index));
        }

        Collections.sort(cars, new CarSortByDateCreation());
        System.out.println("after sort by Date creation");

        for (int index = 0; index < cars.size(); index++) {
            System.out.println(cars.get(index));
        }

        Collections.sort(cars, new CarSortByColor());
        System.out.println("after sort by color");
        for (int index = 0; index < cars.size(); index++) {
            System.out.println(cars.get(index));
        }

        Collections.sort(cars, new CarSortBySeats());
        System.out.println("after sort by seats");
        for (int index = 0; index < cars.size(); index++) {
            System.out.println(cars.get(index));
        }
    }
}
