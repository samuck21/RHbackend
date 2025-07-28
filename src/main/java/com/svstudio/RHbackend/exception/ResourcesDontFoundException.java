package com.svstudio.RHbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourcesDontFoundException extends RuntimeException{
public ResourcesDontFoundException(String message){
    super(message);
}
}
