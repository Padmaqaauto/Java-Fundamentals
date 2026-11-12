package se.lexicon.practice.session6;

@FunctionalInterface
public interface TaskAction {

    void execute(Todo todo);
}
