package com.vidvaan.jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementEx {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "satya", "satya");
			preparedStatement = connection.prepareStatement("insert into player values(?,?)");
			preparedStatement.setInt(1, 101);
			preparedStatement.setString(2, "Satya");
			int rowsInserted = preparedStatement.executeUpdate();
			System.out.println(rowsInserted+ " Successfully Inserted");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
