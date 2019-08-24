package com.geekstyle.multidatabase.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.geekstyle.multidatabase.model.Country;

@Mapper
public interface CountryDao {
	
	@Select({
        "select id,name,country_code countryCode,country_code_3d countryCode3d,phone_code phoneCode from country order by name"
	})
	public List<Country> queryAll();
	
}
