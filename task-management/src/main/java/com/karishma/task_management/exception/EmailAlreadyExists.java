package com.karishma.task_management.exception;

public class EmailAlreadyExists extends RuntimeException{
    public EmailAlreadyExists(String message)
    {
        super(message);
    }
}
