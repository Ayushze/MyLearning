package com.xyz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

class resultset{
	public static void main(String[] args) {
		System.out.println("Starting...");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernatedemo2", "root", "Tiger@123");
			String q = "Select * from emp1";
			Statement stmt = con.createStatement();
			ResultSet r = stmt.executeQuery(q);
			while(r.next()) {
				int ID = r.getInt("ID");
				String Name = r.getString("Name");
				int Age = r.getInt("Age");
				System.out.println(ID);
				System.out.println(Name);
				System.out.println(Age);
			}
			
			stmt.close();
			con.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Process completed");
	}
}