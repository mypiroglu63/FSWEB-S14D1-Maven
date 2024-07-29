package com.workintech.developers;

public class JuniorDeveloper extends Employee {
    // Constructor
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Junior Developer is coding simple features.");
        setSalary(getSalary() * 1.05); // Maaşı %5 artır
    }
}
