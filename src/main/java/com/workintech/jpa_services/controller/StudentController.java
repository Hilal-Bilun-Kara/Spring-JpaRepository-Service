package com.workintech.jpa_services.controller;

import com.workintech.jpa_services.dto.StudentResponseRecord;
import com.workintech.jpa_services.entity.Gender;
import com.workintech.jpa_services.entity.Student;
import com.workintech.jpa_services.service.StudentService;
import jakarta.validation.constraints.Positive;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@validated => Git, objelerden gelen validation kurallarına uygula, noblank, notnull,siz vs
@Validated
@RestController
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @PostMapping("/")
    public Student save(@Validated @RequestBody Student student){
        return studentService.save(student);
    }

    @GetMapping("/search/{name}")
        public List<Student> searchByFirstName(@PathVariable String name){
            return studentService.searchByFirstName(name);
        }

    @GetMapping("/byGender/{gender}")
    public List<Student> searchByGender(@PathVariable Gender gender){
        return studentService.searchByGender(gender);
    }

    @GetMapping("/{id}")
    public StudentResponseRecord findById(@Positive @PathVariable long id){
        Student student = studentService.findById(id);
        return new StudentResponseRecord(student.getFirstName(),student.getLastName());
    }

    @GetMapping("/{id}")
    public Student delete(@Positive @PathVariable long id){
        return studentService.delete(id);
    }



}
