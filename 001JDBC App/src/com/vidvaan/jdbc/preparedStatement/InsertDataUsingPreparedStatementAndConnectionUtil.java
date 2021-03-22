package com.vidvaan.jdbc.preparedStatement;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vidvaan.jdbc.connectionUtil.ConnectionUtilEx2;



public class InsertDataUsingPreparedStatementAndConnectionUtil {
	public static void main(String[] args) {
		PreparedStatement preparedStatement = null;
		Connection connection = ConnectionUtilEx2.getConnection();
		try {
			preparedStatement = connection.prepareStatement("insert into player values(?,?)");
			preparedStatement.setInt(1, 102);
			preparedStatement.setString(2, "Venkat");
			int rowInserted = preparedStatement.executeUpdate();
			System.out.println(rowInserted + " Successfully Inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
