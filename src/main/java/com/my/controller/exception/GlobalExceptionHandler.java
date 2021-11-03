package com.my.controller.exception;

import com.my.service.exception.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<Object> handleObjectNotFoundException(ObjectNotFoundException ex) {
        String errorMessage = ex.isMessagePresent()
                ? ex.getMessage()
                : String.format("Object not found [id=%s, objectType=%s]", ex.getId(), ex.getObjectClass());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }
}
