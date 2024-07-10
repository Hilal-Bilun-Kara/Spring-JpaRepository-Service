package com.workintech.jpa_services.controller;

import com.workintech.jpa_services.entity.Instructor;
import com.workintech.jpa_services.entity.Student;
import com.workintech.jpa_services.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instructor")
public class InstructorController {

    private final InstructorService instructorService;

    @Autowired
    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @PostMapping("/")
    public Instructor save(@RequestBody Instructor instructor){
        return instructorService.save(instructor);
    }
}
