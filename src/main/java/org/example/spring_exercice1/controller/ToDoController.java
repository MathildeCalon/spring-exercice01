package org.example.spring_exercice1.controller;

import org.example.spring_exercice1.entity.ToDo;
import org.example.spring_exercice1.service.ToDoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ToDoController {
    ToDoService toDoService = new ToDoService();

    @RequestMapping("/")
    public String displayList(Model model){
        List<ToDo> list = toDoService.getToDoList();

        model.addAttribute("listToDo", list);
        return "home";
    }

    @RequestMapping("/details")
    public String displayDetail(Model model){
        ToDo todo = new ToDo("test", "test", false);
        System.out.println(todo);
        model.addAttribute("todo", todo);
        return "todo";
    }
}
