package com.mohammedabdoh.dsa.algorithms.sorting.general;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class General {
    public static void sort() {
        Integer prim[] = new Integer[] { 3, 4, 7, 1, 8, 9, 5, 2 };
        char prim2[] = new char[] { 'a', 'e', 'l', 'w' };
        Person[] persons = new Person[] { new Person("Mohammed", 40), new Person("Ahmed", 35),
                new Person("Osama", 30) };
        List<Integer> nums = Arrays.asList(1,3,5,8,5,3,3);
        List<Person> people = Arrays.asList(new Person("Ali", 12), new Person("Mustafa", 18));
        
        Arrays.sort(prim, new myCustomSorter());
        Arrays.sort(prim2);
        Arrays.sort(persons, Collections.reverseOrder());
        Collections.sort(nums, Collections.reverseOrder());
        Collections.sort(people, Collections.reverseOrder());

        System.out.println(Arrays.toString(prim));
        System.out.println(Arrays.toString(prim2));
        System.out.println(Arrays.toString(persons));
        System.out.println(nums);
        System.out.println(people);
    }
}

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }
}

class myCustomSorter implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 % 2 - o2 % 2;
    }
}
