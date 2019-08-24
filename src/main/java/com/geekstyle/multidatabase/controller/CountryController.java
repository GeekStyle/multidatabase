package com.geekstyle.multidatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geekstyle.multidatabase.model.Country;
import com.geekstyle.multidatabase.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {
	
	@Autowired
	CountryService countryService;
	
	@GetMapping()
	public ResponseEntity<?> getAllCountry() {
		List<Country> countryList = countryService.queryAll();
		return ResponseEntity.ok(countryList);
	}
	
}
