package se.lexicon.practice.session4;

public class App {
    void main(){
        Laptop laptop = new Laptop("Dell","XPS 15");
        Employee anna = new Employee("Anna","Tester", Department.IT, 50000);
//        anna.name = "Anna";
//        anna.role = "Tester";
//        anna.department = "IT";
//        anna.salary = 50000;

        anna.introduce();
        anna.work();
        anna.raiseSalary(5000);
        anna.displayInfo();

        Employee lena = new Employee("Lena","Designer", Department.MARKETING, 35000);
//        lena.name = "Lena";
//        lena.role = "Designer";
//        lena.department = "Marketing";
//        lena.salary = 3000;

        IO.println("\n");
        lena.introduce();
        lena.work();
        lena.raiseSalary(2500);
        lena.displayInfo();

        Employee unknown = new Employee();
        IO.println("\n");
        unknown.displayInfo();

        Employee junior = new Employee("Junior");
        IO.println("\n");
        junior.displayInfo();

        Employee.printEmployees();
        Employee emp = new Employee("Edward", "Developer", Department.IT, 75000);

        emp.setSalary(80000);
        //emp.setSalary(-99999);
        emp.displayInfo();
        //emp.setDepartment(null);
        // "" | null | -99999.0   ← broken object, Java said nothing
        emp.use(laptop);

        //Aggregation
        Company techCorp = new Company("TechCorp");
        techCorp.hire(anna);
        techCorp.hire(lena);
        techCorp.hire(emp);
        techCorp.listEmployees();


        Employee johan = new Employee("Johan", "Developer", Department.IT,        80000, "2023-01-15", "Full-Time");
        Employee sofia = new Employee("Sofia", "Designer",  Department.MARKETING, 60000, "2023-03-01", "Part-Time");

        johan.displayInfo();
        sofia.displayInfo();

    }
}
