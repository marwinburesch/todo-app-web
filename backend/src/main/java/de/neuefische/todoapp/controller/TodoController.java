package de.neuefische.todoapp.controller;

import de.neuefische.todoapp.model.Todo;
import de.neuefische.todoapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {

    private final TodoService todos;

    @Autowired
    public TodoController(TodoService todos) {
        this.todos = todos;
    }

    @GetMapping
    public List<Todo> getTodos() {
        return todos.getAllTodos();
    }

    @PutMapping
    public Todo addTodo(@RequestBody Todo newTodo) {
        todos.addTodo(newTodo);
        return newTodo;
    }
}
