package com.xyz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

class createStatement{
	public static void main(String[] args) {
		
		System.out.println("Starting...");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "Tiger@123");
			String q = "create table emp1(emp_id int(12), emp_Name varchar(20), Contact int(20), emp_address varchar(50))";
			Statement stmt = con.createStatement();
			stmt.execute(q);
			stmt.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("It's done");
	}
}