package com.workintech.developers;

public class MidDeveloper extends Employee {
    // Constructor
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Mid Developer is coding and reviewing junior code.");
        setSalary(getSalary() * 1.07); // Maaşı %7 artır
    }
}