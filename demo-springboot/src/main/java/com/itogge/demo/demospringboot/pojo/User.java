package com.itogge.demo.demospringboot.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class User {

	private String name;
	
	@JsonIgnore(value=false)
	private String password;
	
	private Integer age;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss a", locale="zh" , timezone="GMT+8")
	private Date birthday;
	
	@JsonInclude(Include.NON_NULL)
	private String desc;
	
	public User(String name, String password, Integer age, Date birthday, String desc) {
		this.name = name;
		this.password = password;
		this.age = age;
		this.birthday = birthday;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", age=" + age + ", birthday=" + birthday + ", desc="
				+ desc + "]";
	}

}
