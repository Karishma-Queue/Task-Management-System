package com.karishma.task_management.model.entity;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum TaskStatus {
    TO_DO,IN_PROGRESS,IN_REVIEW,DONE;
    @JsonCreator
    public static TaskStatus fromString(String value) {
        return TaskStatus.valueOf(value.toUpperCase());
    }
}
