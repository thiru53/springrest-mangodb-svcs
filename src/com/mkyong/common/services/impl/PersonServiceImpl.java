package com.mkyong.common.services.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mkyong.common.dao.PersonDao;
import com.mkyong.common.services.PersonService;

@Service(value="personServiceImpl")
public class PersonServiceImpl implements PersonService{

	
	@Resource(name="personDaoImpl")
	PersonDao personDao;
	
	@Override
	public String getPerson() {
		
		String b = personDao.getPerson();
		System.out.println(b);
		return "Thiru";
	}

}
