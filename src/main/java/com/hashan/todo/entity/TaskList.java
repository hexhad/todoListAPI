package com.hashan.todo.entity;

import com.hashan.todo.utils.Domain.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class TaskList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "T_ID", nullable = false)
    private Integer taskId;

    @Column(name = "T_DETAILS")
    private String taskDetails;

    @Enumerated(EnumType.STRING)
    @Column(name = "T_TYPE")
    private TaskStatus status;

}
