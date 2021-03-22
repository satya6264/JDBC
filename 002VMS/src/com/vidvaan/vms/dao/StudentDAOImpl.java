package com.vidvaan.vms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vidvaan.ems.util.ConnectionUtil;
import com.vidvaan.vms.model.Student;
import com.vidvaan.vms.queries.Queries;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public void insert(Student student) {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement=connection.prepareStatement(Queries.STD_INSERT);
			preparedStatement.setInt(1, student.getSid());
			preparedStatement.setString(2, student.getSname());
			preparedStatement.setInt(3, student.getSfee());
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Student student) {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(Queries.STD_UPDATE_BY_ID);
			preparedStatement.setInt(3, student.getSid());
			preparedStatement.setString(1, student.getSname());
			preparedStatement.setInt(2, student.getSfee());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int sid) {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement= connection.prepareStatement(Queries.STD_DELETE_BY_ID);
			preparedStatement.setInt(1, sid);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
