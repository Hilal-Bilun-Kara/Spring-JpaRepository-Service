package com.workintech.jpa_services.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;


@Getter
public class StudentExceptions extends RuntimeException{

    private HttpStatus httpStatus;

    public StudentExceptions(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
