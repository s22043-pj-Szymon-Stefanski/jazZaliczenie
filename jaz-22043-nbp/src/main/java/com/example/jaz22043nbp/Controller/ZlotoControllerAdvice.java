package com.example.jaz22043nbp.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

public class ZlotoControllerAdvice {
    @ExceptionHandler(HttpClientErrorException.class)
    ResponseEntity<String> HandlerRuntimeException(HttpClientErrorException exception) {
        switch (exception.getStatusCode()){
            case INTERNAL_SERVER_ERROR :
                return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("Exception: 123" );
            case  NOT_FOUND:
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Exception: 234" );
            case BAD_REQUEST:
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Exception: 345" );
            case NO_CONTENT:
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Exception: 456" );
        }
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("Exception: 567" );

    }
}
