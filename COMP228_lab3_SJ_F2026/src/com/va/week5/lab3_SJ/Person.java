package com.va.week5.lab3_SJ;


public class Person {
    private int personId;
    private String name;
    private int age;

    public Person(int personId, String name, int age) {
        this.personId = personId;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void performDuties() {
        System.out.println(name + " is performing general hospital duties.");
    }

    public void displayDetails() {
        System.out.println("ID: " + personId + " | Name: " + name + " | Age: " + age);
    }
}