package com.geekstyle.multidatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekstyle.multidatabase.model.Survey;
import com.geekstyle.multidatabase.service.SurveyService;

@RestController
@RequestMapping("/survey")
@Validated
public class SurveyController {
	
	@Autowired
	SurveyService surveyService;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> querySurveyById(@PathVariable Integer id) {
		Survey survey = surveyService.querySurveyById(id);
		return ResponseEntity.status(HttpStatus.OK).body(survey);
	}
	
}
