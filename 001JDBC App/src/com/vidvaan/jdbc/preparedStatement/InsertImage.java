package com.vidvaan.jdbc.preparedStatement;

import java.sql.*;
import java.io.*;

public class InsertImage {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "satya", "satya");

			PreparedStatement ps = con.prepareStatement("insert into imgtable values(?,?,?)");
			ps.setInt(1, 1);
			ps.setString(2, "test");

			FileInputStream fin = new FileInputStream("E:\\dhoni.jpg");
			ps.setBinaryStream(3, fin, fin.available());
			int i = ps.executeUpdate();
			System.out.println(i + " records affected");

			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}