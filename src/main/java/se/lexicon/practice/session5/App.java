package se.lexicon.practice.session5;

import se.lexicon.practice.session4.Department;

import java.util.ArrayList;
import java.util.List;

public class App {
    void  main(){


        Manager lars = new Manager("Lars", Department.MARKETING, 9000, 5, 12);
        Developer sofia = new Developer("Sofia", Department.IT,25000,"Java","Testing");
        EmployeeDAO dao = new EmployeeDAOImpl();

        lars.introduce();
        sofia.introduce();

        lars.work();
        sofia.writeCode();

        lars.approveLeave(sofia);

        sofia.raiseSalary(5000);
        lars.displayInfo();

        sofia.raiseSalary(3000, "annual performance");

//        Employee e1 = new Manager("Lars",    Department.IT, 90000, 5, 12);
//        Employee e2 = new Developer("Sofia", Department.IT, 75000, "Java", "Backend");
//        Employee e3 = new Developer("Erik",  Department.IT, 70000, "Python", "Full Stack");

//        e1.introduce();
//        e2.introduce();
//        e3.introduce();

        List<Employee> team = new ArrayList<>();
        team.add(new Manager("Lars",    Department.IT, 90000, 5, 12));
        team.add(new Developer("Sofia", Department.IT, 75000, "Java", "Backend"));
        team.add(new Developer("Erik",  Department.IT, 70000, "Python", "Full Stack"));

        Employee johan = new Developer("Johan", Department.IT, 55000, "Java", "Frontend");
        for(Employee e: team){
//            e.introduce();
            switch (e){
                case Manager m -> IO.println(m.getName() + " leads a team of " + m.getTeamSize());
                case Developer d ->  IO.println(d.getName() + " specializes in " + d.getSpecialization());
                default -> IO.println(e.getName() + " is a general employee.");
            }
            e.onboard(johan);
        }

        dao.addEmployee(new Manager("Lars",    Department.IT, 90000, 5, 12));
        dao.addEmployee(new Developer("Sofia", Department.IT, 75000, "Java", "Backend"));
        dao.addEmployee(new Developer("Erik",  Department.IT, 70000, "Python", "Full Stack"));

        IO.println("-----------------------");
        Employee found = dao.findByName("Lars");
        if (found != null) found.introduce();
        IO.println("-----------------------");

        for (Employee e : dao.findAll()) {
            e.displayInfo();
        }
        IO.println("-----------------------");

        dao.remove(found);

        IO.println("-----------------------");
        for (Employee e : dao.findAll()) {
            e.displayInfo();
        }


    }
}
