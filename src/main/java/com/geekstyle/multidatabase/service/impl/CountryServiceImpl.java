package com.geekstyle.multidatabase.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekstyle.multidatabase.dao.CountryDao;
import com.geekstyle.multidatabase.model.Country;
import com.geekstyle.multidatabase.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	CountryDao countryDao;
	
	@Override
	public List<Country> queryAll() {
		return countryDao.queryAll();
	}
	
}
