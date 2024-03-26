package com.example.labwork4vol1;

public class Worker {
	String name;
    String surname;
    double salary;
    public Worker(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
