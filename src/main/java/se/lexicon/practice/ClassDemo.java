package se.lexicon.practice;

class Person{
    //Fields (state)
    String firstName;
    String lastName;
    int age;

    //Method(Behaviour)
    void introduce(){
        IO.println("Hi, I am "+ firstName + " " + lastName + ", age "+ age);
    }
}
public class ClassDemo {
    void main(){

        //Create person p1
        Person p1 = new Person();
        p1.firstName = "John";
        p1.lastName = "Doe";
        p1.age = 53;

        //create person p2
        Person p2 = new Person();
        p2.firstName = "Padma";
        p2.lastName = "Sastha";
        p2.age = 25;

        //create person p3
        Person p3 = new Person();
        p3.firstName = "Jane";
        p3.lastName = "Doe";
        p3.age = 50;

        // Call the method on each object
        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}
