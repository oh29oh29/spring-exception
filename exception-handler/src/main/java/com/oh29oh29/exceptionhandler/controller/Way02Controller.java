package com.oh29oh29.exceptionhandler.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eh")
public class Way02Controller {

    @GetMapping("/second")
    public String hello() { throw new RuntimeException(); }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "ResponseStatus reason text")
    @ExceptionHandler({ RuntimeException.class })
    public void handleException() {
        // Nothing to do
    }
}
