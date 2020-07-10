package com.stockManager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class notFoundException extends RuntimeException {


    public notFoundException(String strMessage)
    {
        super(strMessage);
    }
}