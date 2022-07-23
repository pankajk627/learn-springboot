package com.in28minutes.database.databasedemo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entity.PersonJdbc;

@Repository
public class PersonJdbcDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	// Creating custom Spring JDBC RowMapper
	class PersonRowMapper implements RowMapper<PersonJdbc>{

		@Override
		public PersonJdbc mapRow(ResultSet rs, int rowNum) throws SQLException {
			PersonJdbc personJdbc = new PersonJdbc();
			personJdbc.setId(rs.getInt("id"));
			personJdbc.setName(rs.getString("name"));
			personJdbc.setLocation(rs.getString("location"));
			return personJdbc;
		}
		
	}
	
	public List<PersonJdbc> findAll(){
		
//		return jdbcTemplate.query(" select * from person", new BeanPropertyRowMapper<PersonJdbc>(PersonJdbc.class));
		return jdbcTemplate.query(" select * from person", new PersonRowMapper());
	}
	
	@SuppressWarnings("deprecation")
	public PersonJdbc findById(int id){
		
		return jdbcTemplate.queryForObject("select * from person where id=?", new Object[] {id}, new BeanPropertyRowMapper<PersonJdbc>(PersonJdbc.class));
		
	}
	
	public int deleteById(int id){
		
		return jdbcTemplate.update("delete from person where id=?", new Object[] {id});
		
	}
	
	public int insert(PersonJdbc personJdbc){
		
		return jdbcTemplate.update("insert into person (id, name, location) " + "values(?,?,?)", 
				new Object[] {personJdbc.getId(), personJdbc.getName(), personJdbc.getLocation()});
		
	}
	
	public int update(PersonJdbc personJdbc){
		
		return jdbcTemplate.update("update person " + "set name = ? " + "where id = ?", 
				new Object[] {personJdbc.getName(), personJdbc.getId()});
		
	}

}
