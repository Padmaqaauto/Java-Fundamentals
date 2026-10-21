
package se.lexicon.exercise.exercise3;

import java.util.ArrayList;
import java.util.HashSet;

public class SubmissionTracker {

    /*
     * Collection: HashSet
     *
     * Explanation:
     * HashSet stores only unique student names.
     * It helps identify duplicate submissions.
     * We only need to know whether a student submitted.
     * Submission order does not matter.
     */

    // Stores unique student names across methods
    private HashSet<String> submittedStudents = new HashSet<>();

    // Creates a list of student submissions, including duplicates
    public ArrayList<String> getStudentList() {

        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("John");
        studentList.add("Jane");
        studentList.add("John");  // Duplicate
        studentList.add("Aki");
        studentList.add("Niki");
        studentList.add("Arun");
        studentList.add("Meera");
        studentList.add("Kenny");
        studentList.add("Arun");  // Duplicate
        studentList.add("Leo");

        return studentList;
    }

    // Processes student submissions
    public void submitHomework(ArrayList<String> students) {

        // Throws an exception if the list is null
        if (students == null) {
            throw new IllegalArgumentException(
                    "Students cannot be null"
            );
        }

        IO.println("\nProcessing student submissions:");

        // Checks each student in the list
        for (String student : students) {

            // add() returns true if the student is new
            if (submittedStudents.add(student)) {
                IO.println(student + " submitted successfully.");
            } else {
                // Rejects duplicate submissions
                IO.println("Rejected: " + student
                        + " has already submitted.");
            }
        }

        // Prints all unique submitted students
        IO.println("\nSubmitted Students:");
        IO.println(submittedStudents);

        // Prints the total number of unique students
        IO.println("Total submissions: " + submittedStudents.size());
    }

    // Returns a copy of the submitted student names for testing
    public HashSet<String> getSubmittedStudents() {
        return new HashSet<>(submittedStudents);
    }

    // Main method to run the program
    void main() {

        // Creates the tracker object
        SubmissionTracker tracker = new SubmissionTracker();

        // Gets the student submission list
        ArrayList<String> students = tracker.getStudentList();

        // Processes all submissions
        tracker.submitHomework(students);
    }
}
