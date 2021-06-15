package com.abdulisik.springbootrestful;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectsService {
	
	@Autowired
	private JdbcTemplate template;
	
	public List<Subject> findAll() {
		String sql = "select * from SUBJECT";
		RowMapper<Subject> rm = (resultSet, i) -> new Subject(
				resultSet.getInt("id"),
				resultSet.getInt("age"),
				resultSet.getString("job"),
				resultSet.getString("name"),
				resultSet.getString("sex"));
		
		return template.query(sql, rm);
	}
}

