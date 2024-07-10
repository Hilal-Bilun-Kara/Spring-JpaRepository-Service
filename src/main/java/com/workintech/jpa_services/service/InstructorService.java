package com.workintech.jpa_services.service;

import com.workintech.jpa_services.entity.Instructor;
import org.springframework.stereotype.Service;


public interface InstructorService {
    Instructor save(Instructor instructor);
}
