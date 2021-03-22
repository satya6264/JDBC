package com.vidvaan.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class InsertData {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		Driver driver = new OracleDriver();
		try {
			DriverManager.registerDriver(driver);
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mydb", "satya");
			statement = connection.createStatement();
			int rowsInserted = statement.executeUpdate("insert into student values(1001,'satya',20000.00)");
			System.out.println(rowsInserted + "Successfully inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
