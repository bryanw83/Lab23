//package com.Lab23.Lab23;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//
//@Repository
//public class CoffeeDao {
//
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//	
//	public List<Coffee> findAllItems(){
//		return jdbcTemplate.query("select * from items", new BeanPropertyRowMapper<Coffee>(Coffee.class));
//	}
//	
//	public List<Coffee> findByName(String name) {
//		return jdbcTemplate.query("select * from items where name like '%" + name + "%'", new BeanPropertyRowMapper<Coffee>(Coffee.class));
//		
//	}
//	
//}
