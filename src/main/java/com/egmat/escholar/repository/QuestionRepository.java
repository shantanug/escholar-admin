package com.egmat.escholar.repository;

import org.springframework.data.repository.CrudRepository;

import com.egmat.escholar.entities.Question;


public interface QuestionRepository extends CrudRepository<Question, Integer> {
	
}