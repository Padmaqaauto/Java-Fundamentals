package se.lexicon.practice;

public class EmailNotification {

    //sends a simple notification
    public static void send(String message) {
        IO.println("Sending Notification: " + message);
    }

    //overloaded: Send a notification to a specific email
    public static void send(String message, String email){
        IO.println("Sending Email to: " + email +". Message: " + message);
    }

    //Overloaded: Send a notification with a priority level
    public static void send(String message, int priority){
        IO.println("Priority [" +priority+ "]: Notification: " + message);
    }

    void main(){
        send("Hello World");
        send("How are you?","testemail@gmail.com");
        send("How are you?",1);
    }
}
