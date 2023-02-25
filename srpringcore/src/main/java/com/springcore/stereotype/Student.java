package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Component("ob")  --> to change the name from Student to ob
@Scope("prototype")
public class Student {
	@Value("XYZ")
	private String Name;
	@Value("Bangluru")
	private String City;
	
	@Value("#{list}")
	private List<String> address;
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Student(String name, String city) {
		super();
		Name = name;
		City = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", City=" + City + "]";
	}
	
	
}
