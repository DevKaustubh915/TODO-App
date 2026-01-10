package com.example.TODO.App.Controller;

import com.example.TODO.App.Repository.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    //hander menthods

    @GetMapping({"", "/" , "/home" })
    public String showHomePage(Model model){
        model.addAttribute("todos" , todoRepository.findAll());
        return "index";
    }
}
