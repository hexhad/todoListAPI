package com.hashan.todo.utils;

public class Domain {
    public enum TaskStatus{
        DONE, ON_GOING;

        public static TaskStatus getStatus(String status){
            if(status != null){
                return TaskStatus.valueOf(status);
            }
            return null;
        }
    }
}
