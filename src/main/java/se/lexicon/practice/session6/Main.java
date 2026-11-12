package se.lexicon.practice.session6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static TaskFilter highPriority = (todo) -> todo.getPriority() >= 4;
    static TaskFilter mediumPriority = (todo) -> todo.getPriority() == 3;
    static TaskFilter lowPriority = (todo) -> todo.getPriority() <= 2;

    static TaskFilter completed = (todo) -> todo.isCompleted();
    static TaskFilter notCompleted = (todo) -> !todo.isCompleted();

    //Combination of tasks
    static TaskFilter lowAndCompleted = lowPriority.and(completed);
    static TaskAction markCompleted = (todo) -> todo.setCompleted(true);



    void main() {

        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo("Fix bugs", 2, false));
        todos.add(new Todo("Write Tests",1, false));
        todos.add(new Todo("Deploy App", 3, false));
        todos.add(new Todo("Refactor code", 1, true));
        todos.add(new Todo("Updated Documentation", 1, false));
        todos.add(new Todo("Investigate production issue", 5, false));
        todos.add(new Todo("Code review PR #42", 2, true));
        todos.add(new Todo("Optimize database query", 4, false));
        todos.add(new Todo("Plan next sprint", 3, true));
        todos.add(new Todo("Clean up warnings", 2, false));
        todos.add(new Todo("Improve UI layout", 3, false));
        todos.add(new Todo("Release hotfix", 5, true));

//        List<Todo> highPriorityTasks = new ArrayList<>();
//        for (Todo todo : todos) {
//            if (todo.getPriority() >= 4){
//                highPriorityTasks.add(todo);
//            }
//        }
//
//        IO.println("\n Without lambda: high priority tasks" + highPriorityTasks);
//
//        List<Todo> completedTasks = new ArrayList<>();
//        for (Todo todo : todos) {
//            if (todo.isCompleted()){
//                completedTasks.add(todo);
//            }
//        }
//        IO.println("\n Without lambda: completed tasks: " + completedTasks);

        // Filter rules based on the task which we select
//        IO.println("\n ---High Priority Tasks:----");
        IO.println("\nHigh Priority Tasks: " + findTasks(todos,  highPriority ));
        IO.println("\nLow Priority Tasks: " + findTasks(todos,  lowPriority));
        IO.println("\nMedium Priority Tasks: " + findTasks(todos, mediumPriority));
        IO.println("\nCompleted Tasks: " + findTasks(todos, completed));
        IO.println("\nNot Completed Tasks: " + findTasks(todos, notCompleted));

        IO.println("\n Low and completed: " + findTasks(todos, lowAndCompleted));

        IO.println("\n Mark Low Priority tasks as completed: " + applyToMatchingTasks(todos, lowPriority, markCompleted));


    }

    public static List<Todo> findTasks(List<Todo> todos, TaskFilter filter) {

        List<Todo> result = new ArrayList<>();
        for (Todo todo:  todos) {
            if (filter.matches(todo)){
                result.add(todo);
            }
        }
        return result;
    }

    public static List<Todo> applyToMatchingTasks(List<Todo> todos, TaskFilter filter, TaskAction action) {

        List<Todo> updatedList = new ArrayList<>();
        for(Todo todo:  todos) {
            if(filter.matches(todo)){
                action.execute(todo);
                updatedList.add(todo);
            }
        }

        return updatedList;
    }
}
