package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(3, 1.87f, "Dana", new Date(2000, 1, 3)));
        people.add(new Person(2, 1.55f, "Nira", new Date(1992, 7,2)));
        people.add(new Person(1, 1.92f, "Moshe",new Date(1989, 4, 3)));
        people.add(new Person(4, 1.90f, "Ranny", new Date(2001, 6, 9)));


        System.out.println("======== before sort ==========");
        for (int index = 0; index < people.size(); index++)
        {
            System.out.println(people.get(index));
        }

        //Collections.sort(people);
        Collections.sort(people, new PersonCompareByBirthDate());
        Collections.sort(people, new PersonCompareById());
        Collections.sort(people, new PersonCompareByName());

        System.out.println("======== after sort ==========");
        for (int index = 0; index < people.size(); index++)
        {
            System.out.println(people.get(index));
        }

        /*
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(30);
        numbers.add(-12);
        Collections.sort(numbers);
        for (int index = 0; index < numbers.size(); index++)
        {
            System.out.println(numbers.get(index));
        }
         */

        /*targil:
        1.sort by height
        2.etgar: sort by id (add identical id) , if id is the same additional sort by height
        3.etgar : sort by name
         */

        /*targil 2:
        create PersonCompareById
        create PersonCompareByName
        create PersonCompareByBirthDate
        change the default (comparable) to birthday...
        sort by each one and print the sorted list
         */


    }
}
