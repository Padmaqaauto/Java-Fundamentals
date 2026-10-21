package se.lexicon.exercise.exercise3;

import java.util.ArrayList;
import java.util.Collections;

public class ShoppingList {

    public ArrayList<String> createShoppingList(){
        ArrayList<String> items = new ArrayList<>();
        items.add("Bread");
        items.add("Cheese");
        items.add("Rice");
        items.add("Coffee");
        items.add("Pizza");

        return items;
   }

   public void printItems(ArrayList<String> items){
       int count = 1;

       for(String item : items){
           IO.println(count + ". " + item);
           count++;
       }
   }

   public void removeItem(ArrayList<String> items, String item){
       items.remove(item);
   }

    void main(){
        ShoppingList shoppingList = new ShoppingList();
        ArrayList<String> items = shoppingList.createShoppingList();

        IO.println("\nItems in the shopping list:");
        shoppingList.printItems(items);

        shoppingList.removeItem(items, "Cheese");

        IO.println("\nItems after updating the shopping list:");
        shoppingList.printItems(items);
    }

}
