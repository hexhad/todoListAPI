package com.hashan.todo.repo;

import com.hashan.todo.entity.TaskList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo extends JpaRepository<TaskList, Integer> {
}
