package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Student;
import com.example.demo.Internship;
import com.example.demo.RecommendationService;

@RestController
@RequestMapping("/api")
public class RecommendationController {

    @Autowired
    private RecommendationService service;

    @PostMapping("/recommend")
    public List<Internship> recommend(@RequestBody Student student) {

        return service.recommend(student);
    }
}