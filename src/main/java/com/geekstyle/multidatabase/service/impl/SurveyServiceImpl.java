package com.geekstyle.multidatabase.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekstyle.multidatabase.dao.SurveyDao;
import com.geekstyle.multidatabase.model.Survey;
import com.geekstyle.multidatabase.service.SurveyService;

@Service
public class SurveyServiceImpl implements SurveyService{

	@Autowired
	SurveyDao surveyDao;
	
	@Override
	public Survey querySurveyById(Integer id) {
		return surveyDao.querySurveyById(id);
	}
	
}
