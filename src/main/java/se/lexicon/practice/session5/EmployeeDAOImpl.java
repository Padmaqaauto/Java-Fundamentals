package se.lexicon.practice.session5;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO{

    private List<Employee> employees = new ArrayList<>();

    private boolean exists(String name){
        return findByName(name) != null;
    }

    @Override
    public void addEmployee(Employee e) {
        if(exists(e.getName())){
            IO.println(e.getName() + " already exists");
            throw new IllegalArgumentException("Employee already exists");
        }
        employees.add(e);
        IO.println(e.getName() + " has been added");
    }

    @Override
    public List<Employee> findAll() {
        return employees;
    }

    @Override
    public Employee findByName(String name) {
        for (Employee e : employees) {
            if (e.getName().equalsIgnoreCase(name)) return e;
        }
        return null;
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
        IO.println(employee.getName() + " removed from the system.");
    }
}
