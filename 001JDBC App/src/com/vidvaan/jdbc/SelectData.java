package com.vidvaan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectData {

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "satya", "satya");
			statement = connection.createStatement();
			
			rs = statement.executeQuery("SELECT * FROM student");
			
			
			while(rs.next()) {
				System.out.println("Sid : "+rs.getInt(1));
				System.out.println("Sname : "+rs.getString(2));
				System.out.println("Sfee : "+rs.getDouble(3));
				System.out.println("------------------------------");
			}
			
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
