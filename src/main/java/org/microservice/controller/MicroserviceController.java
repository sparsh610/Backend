package org.microservice.controller;

import jakarta.validation.Valid;
import org.microservice.model.User;
import org.microservice.service.interfaces.MicroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MicroserviceController {
    @Autowired
    private MicroService microService;
    @GetMapping("printHello")
    private ResponseEntity printHello(){
        return new ResponseEntity<>("Hello", HttpStatus.ACCEPTED);
    }

    @PostMapping("saveUser")
    private ResponseEntity saveUser(@RequestBody @Valid  User user){
        microService.saveUser(user);
        return new ResponseEntity<>("created",HttpStatus.ACCEPTED);
    }

}
