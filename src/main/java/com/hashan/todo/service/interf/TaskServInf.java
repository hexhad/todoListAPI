package com.hashan.todo.service.interf;


import com.hashan.todo.entity.TaskList;

import java.util.List;

public interface TaskServInf {
    //create
    TaskList createTask(TaskList task);

    //read
    List<TaskList> readAllTasks();
    TaskList readTask(Integer id);
    //update
    TaskList updateTask(TaskList task);
    //delete
    void deleteTask(Integer id);

}
