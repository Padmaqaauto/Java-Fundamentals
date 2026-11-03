package se.lexicon.practice.session4;

public class Employee {

    static int totalEmployee = 0; //shared - belongs to the class

    //fields
    private String     name;
    private String     role;
    private Department department;
    private double     salary;
    private WorkContract contract;

    public Employee(String name, String role, Department department, double salary,
                    String startDate, String contractType) {
        setName(name);
        setRole(role);
        setDepartment(department);
        setSalary(salary);
        this.contract = new WorkContract(startDate, contractType );
        totalEmployee++;  // increments every time a new Employee is created
    }

    public Employee(String name, String role, Department department, double salary) {
        setName(name);
        setRole(role);
        setDepartment(department);
        setSalary(salary);
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
        if(name == null || name.isBlank())
            throw new IllegalArgumentException("Name cannot be null or blank");
        this.name = name;
    }

    public void setRole(String role) {
        if(role == null || role.isBlank())
            throw new IllegalArgumentException("Role cannot be null or blank");
        this.role = role;
    }

    public void setDepartment(Department department) {
        if(department == null)
            throw new IllegalArgumentException("Department cannot be null");
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

    static void printEmployees() {
        IO.println("Total Employees hired: " + totalEmployee);
    }

    // ASSOCIATION method — Laptop is passed as a parameter, not stored as a field.
    public void use(Laptop laptop) {
        if(laptop == null)
            throw new IllegalArgumentException("Laptop cannot be null");
        IO.println(getName() + " is using " + laptop.getDetails());
    }

    // Updated displayInfo to include contract details
    public void displayInfo() {
        String info = getName() + " | " + getRole() + " | " + getDepartment() + " | " + getSalary();
        if (contract != null) info += " | " + contract.getDetails();
        IO.println(info);
    }
}
