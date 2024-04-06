package br.com.anselmo.projeto.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.util.Date;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e) {
        StandardError err = new StandardError(new Date(), HttpStatus.NOT_FOUND.value(), "Not Found", e.getMessage(), "");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }
}