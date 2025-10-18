package com.karishma.task_management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
     @ExceptionHandler
    public ResponseEntity<String> EmailAlreadyExists(EmailAlreadyExists ex)
     {
         return new ResponseEntity<>(ex.getMessage(),HttpStatus.IM_USED);
     }
}
