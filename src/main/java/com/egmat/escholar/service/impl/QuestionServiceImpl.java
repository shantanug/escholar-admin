package com.egmat.escholar.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egmat.escholar.admin.service.QuestionService;
import com.egmat.escholar.admin.service.impl.BaseServiceImpl;
import com.egmat.escholar.entities.Question;
import com.egmat.escholar.repository.QuestionRepository;
@Service("adminQuestionService")

public class QuestionServiceImpl extends 
		BaseServiceImpl<Question,Integer> implements QuestionService {

	private static Logger log = Logger.getLogger(
			QuestionServiceImpl.class.getName());
    
	private QuestionRepository questionRepository;
	
	@Autowired
	public QuestionServiceImpl(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
		
	}

}
