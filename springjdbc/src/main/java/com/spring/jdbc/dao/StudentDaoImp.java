package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;

public class StudentDaoImp implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		//insert query
        String q = "insert into student values(?,?,?)";
        int r = this.jdbcTemplate.update(q,student.getId(),student.getName(),student.getCity());
		return r;
	}

	public int delete(int id) {
		String q = "delete from student where id=3";
		int r = this.jdbcTemplate.update(q);
		return r;
	}
}
