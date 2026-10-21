package se.lexicon.practice.session3;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
    void main(){

        //1.Declaration and Initialization
        ArrayList<String> names = new ArrayList<String>();

        //2.Adding Elements
        names.add("John");
        names.add("Jane");
        names.add("Julie");
        names.add("Julie");

        //3.Accessing Elements
        IO.println("First name: "+ names.get(0));

        //4. Modifying Elements
       names.set(2, "Marcus");

       //5. Removing elements
        names.remove("John");
        names.remove(1);

        //6.Size of ArrayList
        IO.println("Size of ArrayList: " + names.size());

        //7. Check if an elements exists
        boolean containsMarcus = names.contains("Julie");
        IO.println(containsMarcus);

        //8. Sorting
        Collections.sort(names);

        //9. Iterating
        for(String name : names){
            IO.println(name);
        }


    }
}
