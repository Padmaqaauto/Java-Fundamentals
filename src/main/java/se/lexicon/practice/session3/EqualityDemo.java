package se.lexicon.practice.session3;

 class Person{
        int id;
        String name;
        String email;


}

public class EqualityDemo {
     void main()
     {
         equalityExample();
     }

     public static void equalityExample(){

         //1. create 2 person objects with identical data
         Person p1 = new Person();
         p1.id = 1;
         p1.name = "John";
         p1.email = "John123@gmail.com";

         Person p2 = new Person();
         p2.id = 1;
         p2.name = "John";
         p2.email = "John123@gmail.com";

         //2. Compare Using equals
         boolean isEqualTwoPersons = p1.equals(p2);
         IO.println("isEqualTwoPersons: " + isEqualTwoPersons);

         //3. Compare with Strings
         String test1 = "TEST";
         String test2 = "TEST";

         boolean isEqualTwoStrings =  test1.equals(test2);
         IO.println("isEqualTwoStrings: " + isEqualTwoStrings);
     }
}
