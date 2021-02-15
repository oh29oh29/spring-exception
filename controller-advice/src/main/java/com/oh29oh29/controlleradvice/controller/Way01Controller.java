package com.oh29oh29.controlleradvice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ca")
public class Way01Controller {

    @GetMapping("/first")
    public String hello() { throw new RuntimeException(); }

}
