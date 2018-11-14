package com.Lab23.Lab23;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public int addPerson(String fname, String lname, String email, String phone, String password) {
		String addQuery = "insert into users(firstname, lastname, email, phonenumber, password) values(?,?,?,?,?)";
		return jdbcTemplate.update(addQuery, fname, lname, email, phone, password);
	}
	
}
