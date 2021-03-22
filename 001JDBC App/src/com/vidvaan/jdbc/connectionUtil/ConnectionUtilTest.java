package com.vidvaan.jdbc.connectionUtil;

import java.sql.Connection;

public class ConnectionUtilTest {
	public static void main(String[] args) {
		Connection connection = ConnectionUtilEx3.getConnection();
		System.out.println(connection);
	}

}
