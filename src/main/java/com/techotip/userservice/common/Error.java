package com.techotip.userservice.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Error {

    private final Integer code;
    private final String errorDescription;

    public Error(Integer code, String errorDescription) {
        this.code = code;
        this.errorDescription = errorDescription;
    }
}
