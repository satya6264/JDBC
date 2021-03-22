package com.vidvaan.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class CreateTable {
	public static void main(String[] args) {
		Connection connection=null;
		Statement statement= null;
		Driver driver = new OracleDriver();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "satya", "satya");
			statement=connection.createStatement();
			boolean tableCreate=statement.execute("create table accntttt(anum number(20),aname varchar2(20),aamount number(20))");
			System.out.println(tableCreate+" Table created successfully");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
