package se.lexicon.practice.sessio4;

public class Employee {

    static int totalEmployee = 0; //shared - belongs to the class

    //fields
    private String     name;
    private String     role;
    private Department department;
    private double     salary;

    public Employee(String name, String role, Department department, double salary) {
        //setName(name);
        setRole(role);
        setDepartment(department);
        setSalary(salary);
        totalEmployee++;  // increments every time a new Employee is created
    }

    //default Constructor
    public Employee() {
    }

    //Name-only constructor


    public Employee(String name) {
        this.name = name;
        this.role = "Unassigned";
        this.department = Department.IT;
        this.salary = 0;
    }

//    public Employee(String name, String role, Department department, double salary) {
//        this.name = name;
//        this.role = role;
//        this.department = department;
//        this.salary = salary;
//        totalEmployee++;
//    }


    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public Department getDepartment() {
        return department;
    }

    // Getter — read only
    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    // Setter — validate before writing
    public void setSalary(double salary) {
        if (salary < 0)
            throw new IllegalArgumentException("Salary cannot be negative");
        this.salary = salary;
    }



    void introduce(){
        IO.println("Hi, I'm " + name + ", " + role + " in " + department);
    }

    void work(){
        IO.println(name+ " is working on their tasks.");
    }

    // Adds to salary — validates that the raise is a positive amount
    public void raiseSalary(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Raise amount must be positive.");
        this.salary += amount;
        IO.println(name + "'s new salary: " + salary);
    }

    void displayInfo(){
        IO.println(name + " | " + role + " | " + department + " | " + salary);
    }

    static void printEmployees() {
        IO.println("Total Employees hired: " + totalEmployee);
    }
}
