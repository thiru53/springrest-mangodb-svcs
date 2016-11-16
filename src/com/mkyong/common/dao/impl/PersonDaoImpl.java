package com.mkyong.common.dao.impl;

import org.springframework.stereotype.Repository;

import com.mkyong.common.dao.PersonDao;

@Repository
public class PersonDaoImpl implements PersonDao{

	@Override
	public String getPerson() {
		// TODO Auto-generated method stub
		return "DAOIMPL";
	}

}
