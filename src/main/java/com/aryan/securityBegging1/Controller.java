package com.aryan.securityBegging1;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class Controller {
    @GetMapping
    public String get(){
        return "get successfully";
    }
    @PostMapping
    public String post(){
        return "post successfully";
    }
    @PutMapping
    public String update(){
        return "Update succesfully";
    }
    @DeleteMapping
    public String delete(){
        return "Delete succesfully";
    }
    @GetMapping("/2")
    public String get2(){
        return "get successfully";
    }
    @GetMapping("/csrf")
    public CsrfToken getToken(CsrfToken csrfToken){
        return csrfToken;
    }
}
