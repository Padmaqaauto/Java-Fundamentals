package se.lexicon.exercise;
import  java.util.Scanner;

public class PasswordCheck {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println("Enter password:");
        String password = sc.nextLine();
        int count = 0;

        if(password.length() >= 8){
            count ++;
        }

        boolean upperCase = false;
        boolean digits = false;

        for(int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                upperCase = true;
            }

            if(ch >= '0' && ch <= '9') {
                digits = true;
            }
        }

        if(upperCase) {
            count ++;
        }
        if(digits) {
            count ++;
        }

        IO.println("Rules met : "+ count + " / 3");
        if ( count == 3 ){
            IO.println("Rating : Strong ");
        } else if(count == 2 ){
            IO.println("Rating : Medium ");
        } else {
            IO.println("Rating : Weak ");
        }
        sc.close();
    }
}
