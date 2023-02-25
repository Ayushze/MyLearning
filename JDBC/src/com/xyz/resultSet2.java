package com.xyz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class resultSet2 {

	public static void main(String[] args) {
		try {
			System.out.println("Connecting...");
			Class.forName("com.mysql.jdbc.Driver");
			String q = "select * from emp1";
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernatedemo2","root","Tiger@123");
			Statement stmt = con.createStatement();
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the ID: ");
			int ID = sc.nextInt();
			
			ResultSet rs = stmt.executeQuery(q);
			while(rs.next()) {
				if(rs.getInt(1)==ID) {
					System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getInt(3));
					System.out.println("It's done");
				}
			}
			stmt.close();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
