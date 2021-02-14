package com.oh29oh29.exceptionhandler.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Way02Controller {

    @GetMapping("/second")
    public String hello() { throw new RuntimeException(); }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "ResponseStatus reason text")
    @ExceptionHandler({ RuntimeException.class })
    public void handleException() {
        // Nothing to do
    }
}
