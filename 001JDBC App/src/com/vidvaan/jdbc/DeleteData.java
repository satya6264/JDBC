package com.vidvaan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		try {
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "satya", "satya");
			statement = connection.createStatement();
			int rowsDeleted = statement.executeUpdate("DELETE FROM STUDENT WHERE sid = '102'");
			System.out.println(rowsDeleted + " Successfully Deleted ! ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
            try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
