package se.lexicon.practice.session6;

import se.lexicon.practice.session6.Employee;

import java.util.*;
import java.util.function.Predicate;

public class StreamApiDemo {

    static Predicate<Integer> isEven = i -> i % 2 == 0;
    static Predicate<Integer> biggerThanFour = number -> number > 4;
   void main(){
       List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10);

       List<Integer>  evenNumbers =numbers.stream()
                                          .filter(isEven)
                                          .toList();

       List<Integer> greaterThanFour = numbers.stream()
               .filter(i -> i % 2 == 0)
               .filter(number -> number > 4)
               .toList();

       IO.println("\nEven numbers: " + evenNumbers);
       IO.println("Greater than four even numbers: " + greaterThanFour);

      List<Integer> distinctNumbers = Arrays.asList(1,2,2,3,3,3,4)
               .stream()
               .distinct()
               .toList();
       IO.println("Distinct numbers: " + distinctNumbers);

       Optional<Integer> element = numbers.stream()
               .findFirst();
       element.ifPresent(number -> IO.println("First number: " + number));

       long count = numbers.stream()
               .count();
       IO.println("Count of numbers: " + count);

       List<Employee> employees = new ArrayList<>();
       employees.addAll(Arrays.asList(
               new Employee("Anna", "Engineering", 30, 60000),
               new Employee("Erik", "Engineering", 35, 70000),
               new Employee("Karin", "HR", 28, 50000),
               new Employee("Lars", "HR", 40, 45000),
               new Employee("Sofia", "Finance", 32, 65000),
               new Employee("Gustav", "Finance", 25, 55000),
               new Employee("Ingrid", "Engineering", 45, 80000),
               new Employee("Oskar", "Engineering", 29, 62000),
               new Employee("Maja", "HR", 33, 52000),
               new Employee("Nils", "Finance", 38, 68000),
               new Employee("Astrid", "Engineering", 27, 58000),
               new Employee("Sven", "HR", 42, 47000),
               new Employee("Elin", "Finance", 31, 64000),
               new Employee("Johan", "Engineering", 36, 72000),
               new Employee("Linnea", "HR", 26, 48000)
       ));

       IO.println("\nFiltering Employees (Engineering, >60k)");
       List<Employee> engineeringEmployees = employees.stream()
               .filter(e -> e.getDepartment().equals("Engineering"))
               .filter(e-> e.getSalary() > 60000)
               .toList();
       engineeringEmployees.forEach(employee ->  IO.println(employee.toString()));

       // Get employee name and sort by salary
       IO.println("\n Get Employee names and sort them by salary");
       List<String> sortedEmployees = employees.stream()
               .sorted(Comparator.comparingDouble(employee -> employee.getSalary()))
               .map(employee -> employee.getName())
               .toList();
       sortedEmployees.forEach(s -> IO.println(s));

        // Get Unique Departments
       IO.println("\nGet Unique Departments");
       List<String> uniqueDepartments = employees.stream()
               .map(employee -> employee.getDepartment())
               .distinct()
               .toList();
       uniqueDepartments.forEach(s -> IO.println(s));


   }

}
