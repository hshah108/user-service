package com.techotip.userservice.exception;

import com.techotip.userservice.common.Error;
import com.techotip.userservice.common.ErrorCode;
import com.techotip.userservice.common.Errors;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class UserNotFoundException extends RuntimeException {

    Errors errors;

    public UserNotFoundException(Integer userId) {
        errors = new Errors();
        List<Error> errorList = new ArrayList<>();
        Error error = new Error(ErrorCode.E001, "User not found for userId : " + userId);
        errorList.add(error);
        errors.setErrorList(errorList);
    }
}
