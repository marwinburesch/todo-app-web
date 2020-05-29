package de.neuefische.todoapp.service;

import de.neuefische.todoapp.db.TodoDb;
import de.neuefische.todoapp.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoDb todos;

    @Autowired
    public TodoService(TodoDb todos) {
        this.todos = todos;
    }

    public List<Todo> getAllTodos() {
        return todos.getAllTodos();
    }

    public void addTodo(Todo newTodo) {
        todos.addTodo(newTodo);
    }
}
