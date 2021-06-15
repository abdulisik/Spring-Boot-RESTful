package com.abdulisik.springbootrestful;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //mark class as an Entity
@Table //defining class name as Table name
public class Subject {
	@Id   //mark ID as primary key
	@Column //defining ID as column name
	private int id;
	
	@Column //defining age as column name
	private int age;
	
	@Column //defining job as column name
	private String job;
	
	@Column //defining name as column name
	private String name;
	
	@Column //defining sex as column name
	private String sex;
	
	public Subject() {
	}
	
	public Subject(int id, int age, String job, String name, String sex) {
		this.id = id;
		this.age = age;
		this.job = job;
		this.name = name;
		this.sex = sex;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return "{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				", sex=" + sex +
				", job='" + job + '\'' +
				'}';
	}
}

