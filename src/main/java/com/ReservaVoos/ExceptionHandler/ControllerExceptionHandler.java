package com.ReservaVoos.ExceptionHandler;

import com.ReservaVoos.DTORequest.ExceptionDTO;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class ControllerExceptionHandler {
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity existingDocument(DataIntegrityViolationException exception) {
        ExceptionDTO exceptionDTO = new ExceptionDTO("User already exists!");
        return ResponseEntity.badRequest().body(exceptionDTO);
    }

}
