package com.dengdd.learnspringapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:com/dengdd/learnspringapp/db/db.xml")
public class DBTest {
	
	@Autowired
	private ApplicationContext ctx;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public class User {
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getCredits() {
			return credits;
		}

		public void setCredits(int credits) {
			this.credits = credits;
		}

		int id;
		String name;
		int credits;
		
		public User () {
		}
		
		public User(int id, String name, int credits) {
			this.id = id;
			this.name = name;
			this.credits = credits;
		}
		
		@Override
		public String toString () {
			return ToStringBuilder.reflectionToString(this);
		}
	}
	
	@Test
	public void test1() {
		List<User> user = jdbcTemplate.query(" select * from t_user ", new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new User(rs.getInt("user_id"), rs.getString("user_name"), rs.getInt("credits"));
			}
		});
		
		for(User u : user) {
			System.out.println(u);
		}
	}
}
