package com.techotip.userservice.exception.handler;

import com.techotip.userservice.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserNotFoundExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity userNotFoundExceptionHanlder(UserNotFoundException ex) {
        ResponseEntity responseEntity = new ResponseEntity(ex.getErrors(), HttpStatus.BAD_REQUEST);
        return responseEntity;
    }

}
