package com.workintech.developers;

public class SeniorDeveloper extends Employee {
    // Constructor
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Senior Developer is designing system architecture.");
        setSalary(getSalary() * 1.15); // Maaşı %15 artır
    }
}
