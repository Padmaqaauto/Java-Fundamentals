package se.lexicon.practice.sessio4;

public class App {
    void main(){
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
        // "" | null | -99999.0   ← broken object, Java said nothing




    }
}
