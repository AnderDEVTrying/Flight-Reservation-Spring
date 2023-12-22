package com.ReservaVoos.ExceptionHandler;

import ch.qos.logback.core.encoder.EchoEncoder;
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

    @ExceptionHandler(Exception.class)
    public ResponseEntity threatAllExceptions(Exception exception){
        ExceptionDTO exceptionDTO = new ExceptionDTO("An Error as ocurred, please revise the data");
        return ResponseEntity.badRequest().body(exceptionDTO);
    }

}
