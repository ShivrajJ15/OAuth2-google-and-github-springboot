package com.oauth.security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("success")
    ResponseEntity<String> getText() {
       try{
           String str = "Success";
           return new ResponseEntity<>(str, HttpStatus.OK);
       } catch(Exception e){
           System.out.println(e.getMessage());
           return new ResponseEntity<>("error- occurred",HttpStatus.NOT_FOUND);
       }
    }

}
