package com.workintech.jpa_services.service;

import com.workintech.jpa_services.entity.Gender;
import com.workintech.jpa_services.entity.Student;
import com.workintech.jpa_services.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Backgroundda service component
//INstance yarattım services ile
//Service controller ile konuşmaz, controller servislerle konuşabilir.
//Service repository ile konuşur
@Service
public class StudentServiceImpl implements StudentService{

    //Instance yaratıldığı gibi studentRepository için de ınctsace oluşturur
    //Injection ediyorum, ilişki kuruyorum
 private final StudentRepository studentRepository;

 @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }


    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(long id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        if(studentOptional.isPresent()){
            return studentOptional.get();
        }
        //throw exception
        return null;
    }

    @Override
    public List<Student> searchByFirstName(String firstName) {
        return studentRepository.searchByFirstName(firstName);
    }

    @Override
    public List<Student> searchByGender(Gender gender) {
        return studentRepository.searchByGender(gender);
    }


    @Override
    public Student delete(long id) {
        Student student = findById(id);
        studentRepository.delete(student);
        return student;

    }
}
