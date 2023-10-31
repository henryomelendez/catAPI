package com.assigment.assignment.controller;

import com.assigment.assignment.model.Cat;
import com.assigment.assignment.repositories.CatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class CatController {
    @Autowired
    private CatRepository catRepository;

    @GetMapping("/test")
    @ResponseStatus(HttpStatus.OK)
    public String test(){
        catRepository.save(new Cat("test"));
        return "ok";
    }

}
