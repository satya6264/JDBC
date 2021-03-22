package com.vidvaan.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class ConnectionTest2 {
	
	public static void main(String[] args) {
		Connection connection = null;
		
		Driver driver = new OracleDriver();
		try {
			DriverManager.registerDriver(driver);
		//Connection	connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "satya", "satya");
		connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mydb", "satya");
			System.out.println(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
