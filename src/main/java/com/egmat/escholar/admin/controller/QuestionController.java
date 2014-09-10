package com.egmat.escholar.admin.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuestionController {

	private static Logger log = Logger.getLogger(
			QuestionController.class.getName());
	
	@RequestMapping("/createQuestion")
    public ModelAndView createQuestion() {
		ModelMap model = new ModelMap();
		return new ModelAndView("greeting", model);
		
    }

    
}