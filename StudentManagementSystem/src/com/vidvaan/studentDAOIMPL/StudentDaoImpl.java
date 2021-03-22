package com.vidvaan.studentDAOIMPL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vidvaan.queries.Queries;
import com.vidvaan.studentDAO.StudentDAO;
import com.vidvaan.studentmodel.Student;
import com.vidvaan.util.ConnectionUtil;

public class StudentDaoImpl implements StudentDAO {

	@Override
	public void insert(Student student) {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(Queries.STD_INSERT);
//			preparedStatement = connection.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?)");
			preparedStatement.setInt(1, student.getSid());
			preparedStatement.setString(2, student.getSname());
			preparedStatement.setDouble(3, student.getSfee());
//			preparedStatement.executeQuery();
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
			preparedStatement.setDouble(2, student.getSfee());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(preparedStatement, connection);
		}

	}

	@Override
	public void delete(int sid) {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(Queries.STD_DELETE_BY_ID);
			preparedStatement.setInt(1, sid);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Student findById(int eid) {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = connection.prepareStatement(Queries.STD_FIND_BY_ID);
			preparedStatement.setInt(1, eid);
			resultSet = preparedStatement.executeQuery();
			Student student = new Student();
			if (resultSet.next()) {
				student.setSid(resultSet.getInt(1));
				student.setSname(resultSet.getString(2));
				student.setSfee(resultSet.getDouble(3));
			}
			return student;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(resultSet, preparedStatement, connection);
		}

		return null;
	}

	@Override
	public List<Student> findAll() {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<Student> students = null;
		try {
			preparedStatement = connection.prepareStatement(Queries.STD_FINDALL);
			resultSet = preparedStatement.executeQuery();
			students = new ArrayList<>();
			while(resultSet.next()) {
				Student student = new Student();
				student.setSid(resultSet.getInt(1));
				student.setSname(resultSet.getString(2));
				student.setSfee(resultSet.getDouble(3));
				students.add(student);
			}
			return students;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Student> searchByNameLike(String flag) {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement=null;
		ResultSet resultSet = null;
		List<Student> students=null;
		
		try {
			preparedStatement=connection.prepareStatement(Queries.STD_NAME_LIKE);
			preparedStatement.setString(1, flag+"%");
			resultSet=preparedStatement.executeQuery();
			students=new ArrayList<>();
			while(resultSet.next()) {
				Student student = new Student();
				student.setSid(resultSet.getInt(1));
				student.setSname(resultSet.getString(2));
				student.setSfee(resultSet.getDouble(3));
				students.add(student);
			}
			return students;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
