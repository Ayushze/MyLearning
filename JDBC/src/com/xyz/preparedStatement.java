package com.xyz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

class preparedStatement{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("emp_id: ");
		int emp_id = sc.nextInt();
		System.out.print("emp_Name: ");
		String emp_Name = sc.next();
		System.out.print("Contact: ");
		int Contact = sc.nextInt();
		System.out.print("emp_address: ");
		String emp_address = sc.next();
		System.out.println("Starting...");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "Tiger@123");
			String q = "insert into emp1 values(?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(q);
			stmt.setInt(1, emp_id);
			stmt.setString(2, emp_Name);
			stmt.setInt(3, Contact);
			stmt.setString(4, emp_address);
			stmt.execute();
			stmt.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("It's done");
	}
}