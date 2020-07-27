package com.ludus.lms.repository;

import com.ludus.lms.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {


}
