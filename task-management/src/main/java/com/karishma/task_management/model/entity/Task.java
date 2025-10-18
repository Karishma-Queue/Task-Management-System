package com.karishma.task_management.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Task {
    @Id
    private String taskId;
    private String taskTitle;
    private String taskDescription;
    private TaskStatus status = TaskStatus.TO_DO;
    @ManyToOne
    @JoinColumn(name="user_id")

    private User user;

}
