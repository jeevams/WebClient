package com.example.webclient2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentEntity {
	@Id
	private int id;
	private String stuName;
    private String mobile;
    public int getId() {
		return id;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
