package com.vidvaan.jdbc.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;

public class InsertDate {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "satya", "satya");

			PreparedStatement ps = con.prepareStatement("insert into DATEDEMO values(?,?,?)");
			ps.setInt(1, 1);
			ps.setString(2, "test");
			java.util.Date dateUtil = new Date();
			ps.setDate(3, new java.sql.Date(dateUtil.getTime()));

			int i = ps.executeUpdate();
			System.out.println(i + " records affected");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}