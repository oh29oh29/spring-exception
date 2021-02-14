package com.oh29oh29.exceptionhandler.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Way01Controller {

    @GetMapping("/first")
    public String hello() { throw new RuntimeException(); }

    @ExceptionHandler({ RuntimeException.class })
    public String handleException() {
        return "ExceptionHandler test";
    }
}
