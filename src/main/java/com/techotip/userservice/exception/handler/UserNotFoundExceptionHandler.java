package com.techotip.userservice.exception.handler;

import com.techotip.userservice.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class UserNotFoundExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity userNotFoundExceptionHanlder(UserNotFoundException ex) {
        ResponseEntity responseEntity = new ResponseEntity(ex.getErrors(), HttpStatus.BAD_REQUEST);
        return responseEntity;
    }

}
