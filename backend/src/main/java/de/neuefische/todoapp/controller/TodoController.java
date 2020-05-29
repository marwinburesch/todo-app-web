package de.neuefische.todoapp.controller;

import de.neuefische.todoapp.model.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {

    private final List<Todo> todos = new ArrayList<>(List.of(
            new Todo("1323","bla blub", "OPEN")
    ));

    @GetMapping
    public List<Todo> getTodos() {
        return  todos;
    }
}
