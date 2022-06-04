package com.hashan.todo.controller;

import com.hashan.todo.entity.TaskList;
import com.hashan.todo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class ListController {

    @Autowired
    TaskService taskService;

    //CREATE task
    @CrossOrigin
    @PostMapping("/create")
    public TaskList createTask(@RequestBody @Validated TaskList taskList){
        return taskService.createTask(taskList);
    }

    //READ tasks
    @CrossOrigin
    @GetMapping("/read-all")
    public List<TaskList> readAllTasks(){
        return taskService.readAllTasks();
    }

    //READ task
    @CrossOrigin
    @GetMapping("/read-one/{task}")
    public TaskList readTask(@PathVariable (value = "task", required = true) Integer task){
        return taskService.readTask(task);
    }

    //UPDATE task
    @CrossOrigin
    @PutMapping("/update")
    public TaskList updateTask(@RequestBody @Validated TaskList taskList){
        return taskService.updateTask(taskList);
    }


    //DELETE task
    @CrossOrigin
    @DeleteMapping("/delete/{task}")
    public void deleteTask(@PathVariable (value = "task", required = true) Integer task){
        taskService.deleteTask(task);
    }

}
