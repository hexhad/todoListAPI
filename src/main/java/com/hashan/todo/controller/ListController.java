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
    @PostMapping("/create")
    public TaskList createTask(@RequestBody @Validated TaskList taskList){
        return taskService.createTask(taskList);
    }

    //READ tasks
    @GetMapping("/read-all")
    public List<TaskList> readAllTasks(){
        return taskService.readAllTasks();
    }

    //READ task
    @GetMapping("/read-one/{task}")
    public TaskList readTask(@PathVariable (value = "task", required = true) Integer task){
        return taskService.readTask(task);
    }

    //UPDATE task
    @PutMapping("/update")
    public TaskList updateTask(@RequestBody @Validated TaskList taskList){
        return taskService.updateTask(taskList);
    }


    //DELETE task
    @DeleteMapping("/delete/{task}")
    public void deleteTask(@PathVariable (value = "task", required = true) Integer task){
        taskService.deleteTask(task);
    }
}
