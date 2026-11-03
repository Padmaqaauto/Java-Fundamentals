package se.lexicon.practice.session4;

import java.util.ArrayList;
import java.util.List;

public class Company {

    // AGGREGATION — "has-a" (weak)
    private final String name;
    private final List<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void hire(Employee employee) {
        employees.add(employee);
        IO.println("\n" + employee.getName() + " is hired at " + name);
    }

    public void listEmployees() {
        IO.println("\nEmployees at " + name + " : ");
        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }

}
