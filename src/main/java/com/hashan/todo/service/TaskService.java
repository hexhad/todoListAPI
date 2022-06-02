package com.hashan.todo.service;

import com.hashan.todo.entity.TaskList;
import com.hashan.todo.repo.TaskRepo;
import com.hashan.todo.service.interf.TaskServInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements TaskServInf {

    @Autowired
    TaskRepo taskRepo;


    @Override
    public TaskList createTask(TaskList task) {
        return taskRepo.save(task);
    }

    @Override
    public List<TaskList> readAllTasks() {
        return taskRepo.findAll();
    }

    @Override
    public TaskList readTask(Integer id) {
        return taskRepo.findById(id).orElse(null);
    }

    @Override
    public TaskList updateTask(TaskList task) {
        return taskRepo.save(task);
    }

    @Override
    public void deleteTask(Integer id) {
        taskRepo.deleteById(id);
    }
}
