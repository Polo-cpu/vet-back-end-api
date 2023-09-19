package com.atilla.vetApp.VetApplication.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class ErrorHandlerController implements ErrorController {
    @GetMapping("/error")
    public String customError(){
        return "error";
    }
}
