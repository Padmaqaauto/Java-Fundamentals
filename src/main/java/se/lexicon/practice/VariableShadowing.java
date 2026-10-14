package se.lexicon.practice;

public class VariableShadowing {
    String name; // class level field

    void setName(String name){
        this.name = name;
        IO.println("Product: "+ name);
    }

    void main(){
        setName("Keyboard");
        setName("Mouse");
        setName("Laptop");
    }

}
