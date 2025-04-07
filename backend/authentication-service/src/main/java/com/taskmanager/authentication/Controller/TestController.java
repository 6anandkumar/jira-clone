package com.taskmanager.authentication.Controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/service-status")
public class TestController {

    @GetMapping(path = "/isAlive")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("true");
    }
}
