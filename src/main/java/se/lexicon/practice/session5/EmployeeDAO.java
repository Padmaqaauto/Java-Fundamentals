package se.lexicon.practice.session5;

import java.util.List;

public interface EmployeeDAO {

    void addEmployee(Employee e);
    List<Employee> findAll();
    Employee findByName(String name);
    void remove(Employee e);

}
