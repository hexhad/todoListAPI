package com.hashan.todo.dto;

import com.hashan.todo.utils.Domain.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class TaskDto implements Serializable {
    private Integer taskId;
    private String taskDetails;
    private TaskStatus status;
}
