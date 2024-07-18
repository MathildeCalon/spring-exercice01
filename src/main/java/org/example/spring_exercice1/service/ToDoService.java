package org.example.spring_exercice1.service;

import org.example.spring_exercice1.entity.ToDo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {
    List<ToDo> list = new ArrayList<ToDo>(){{
        new ToDo("clean", "clean house", false);
        new ToDo("tidy", "tidy house", true);
    }};

    public List<ToDo> getToDoList(){
        return list;
    }

    public ToDo getToDo(String name){
        System.out.println("Service");
        for(ToDo toDo1 : list){
            if(toDo1.getName().equals(name)){
                return toDo1;
            }
        }
        return null;
    }
}
