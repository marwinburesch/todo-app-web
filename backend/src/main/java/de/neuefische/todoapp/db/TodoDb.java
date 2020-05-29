package de.neuefische.todoapp.db;

import de.neuefische.todoapp.model.Todo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class TodoDb {

    private final List<Todo> todos = new ArrayList<>(List.of(
            new Todo("1323","bla blub", "OPEN")
    ));

    public List<Todo> getAllTodos() {
        return todos;
    }

    public Todo addTodo(Todo newTodo) {
        String newTodoId = UUID.randomUUID().toString();
        newTodo.setId(newTodoId);
        newTodo.setStatus("OPEN");
        todos.add(newTodo);
        return newTodo;
    }
}
