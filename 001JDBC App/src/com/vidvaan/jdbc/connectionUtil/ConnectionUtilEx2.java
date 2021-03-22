package com.vidvaan.jdbc.connectionUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtilEx2 {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:5121:xe", "satya", "satya");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void close(Connection connection) {

		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	public static void close(Statement statement, Connection connection) {
			try {
				if(statement != null) {
				statement.close();
				}
				close(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	public static void close(ResultSet resultSet, Statement statement, Connection connection) {
			try {
				if(resultSet != null) {
				resultSet.close();
				}
			close(statement, connection);
			} catch (SQLException e) {
				e.printStackTrace();
			
		}
	}
}
