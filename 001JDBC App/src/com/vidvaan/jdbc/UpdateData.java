package com.vidvaan.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class UpdateData {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement=null;
		Driver driver = new OracleDriver();
		try {
			DriverManager.registerDriver(driver);
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "satya", "satya");
			statement=connection.createStatement();
			int rowUpdate=statement.executeUpdate("update student set sname = 'satya.g' where sid=1001");
			System.out.println(rowUpdate+"Successfully updated");
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
