package com.ludus.lms.repository;

import com.ludus.lms.entity.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question,Integer> {
}
