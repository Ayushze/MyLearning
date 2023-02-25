package com.springcore.javaconfig;

// import org.springframework.stereotype.Component;
//@Component
public class Student {
	
	private Samosa samosa;
	
	public void study() {
		this.samosa.display();
		System.out.println("student method in student class");
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
}
