package com.abdulisik.springbootrestful;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //mark class as an Entity
@Table //defining class name as Table name
public class Subjects {
	@Id   //mark ID as primary key
	@Column //defining ID as column name
	private int id;
	
	@Column //defining name as column name
	private String name;
	
	@Column //defining age as column name
	private int age;
	
	@Column //defining sex as column name
	private char sex;
	
	@Column //defining job as column name
	private String job;
	
	public Subjects() {
	}
	
	public Subjects(int id, String name, int age, char sex, String job) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.job = job;
	}
	
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
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getSex() {
		return sex;
	}
	
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
}

