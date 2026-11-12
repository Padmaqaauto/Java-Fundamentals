package se.lexicon.practice.session6;

@FunctionalInterface
public interface TaskFilter {

    boolean matches(Todo todo);

    //Combine two filters
    default TaskFilter and (TaskFilter other) {
        return todo -> this.matches(todo) && other.matches(todo);
    }

    //Combine two filters with OR
    default TaskFilter or (TaskFilter other) {
        return todo -> this.matches(todo) || other.matches(todo);
    }

    //Reverse filter condition
    default TaskFilter negate(){
        return todo -> !this.matches(todo);
    }
}
