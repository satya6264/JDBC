package com.vidvaan.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class BatchUpdate {
	
	public static void main(String[] args) {
		Driver driver = new OracleDriver();
		try {
			DriverManager.registerDriver(driver);
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "veeru", "veeru");
			Statement statement=connection.createStatement();
			statement.addBatch("insert into student values(1002,'nagaraju',10000.00)");
			statement.addBatch("insert into student values(1003,'ramana',14000.00)");
			statement.addBatch("insert into student values(1004,'srikanth',15000.00)");
			statement.addBatch("insert into student values(1005,'sravan',17000.00)");
			statement.addBatch("insert into student values(1006,'naresh',23000.00)");
			statement.executeBatch();
			System.out.println("Success");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
