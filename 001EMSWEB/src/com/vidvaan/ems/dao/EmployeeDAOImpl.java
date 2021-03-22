package com.vidvaan.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vidvaan.ems.model.Employee;
import com.vidvaan.ems.quries.Queries;
import com.vidvaan.ems.util.ConnectionUtil;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void insert(Employee employee) {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;

		try {
			preparedStatement = connection.prepareStatement(Queries.EMP_INSERT);
			preparedStatement.setInt(1, employee.getEid());
			preparedStatement.setString(2, employee.getEname());
			preparedStatement.setDouble(3, employee.getEsal());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(preparedStatement, connection);
		}
	}

	@Override
	public void update(Employee employee) {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;

		try {
			preparedStatement = connection.prepareStatement(Queries.EMP_UPDATE_BY_ID);
			preparedStatement.setInt(3, employee.getEid());
			preparedStatement.setString(1, employee.getEname());
			preparedStatement.setDouble(2, employee.getEsal());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(preparedStatement, connection);
		}

	}

	@Override
	public void delete(int eid) {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;

		try {
			preparedStatement = connection.prepareStatement(Queries.EMP_DELETE_BY_ID);
			preparedStatement.setInt(1, eid);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(preparedStatement, connection);
		}

	}

	@Override
	public List<Employee> findAll() {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<Employee> employees = null;
		try {
			preparedStatement = connection.prepareStatement(Queries.EMP_FIND_ALL);
			resultSet =  preparedStatement.executeQuery();
			employees = new ArrayList<>();
			while(resultSet.next()) {
				Employee employee = new Employee();
				employee.setEid(resultSet.getInt(1));
				employee.setEname(resultSet.getString(2));
				employee.setEsal(resultSet.getDouble(3));
				employees.add(employee);
			}
			return employees;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionUtil.close(resultSet, preparedStatement, connection);
		}
		
		return null;
	}

	@Override
	public Employee findById(int eid) {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = connection.prepareStatement(Queries.EMP_FIND_BY_ID);
			preparedStatement.setInt(1, eid);
			resultSet =  preparedStatement.executeQuery();
			Employee employee = new Employee();
			if(resultSet.next()) {
				employee.setEid(resultSet.getInt(1));
				employee.setEname(resultSet.getString(2));
				employee.setEsal(resultSet.getDouble(3));
			}
			return employee;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionUtil.close(resultSet, preparedStatement, connection);
		}
		
		return null;
	}

	@Override
	public List<Employee> searchByNameLike(String flag) {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		List<Employee> employees = null;
		try {
			preparedStatement = connection.prepareStatement(Queries.EMP_NAME_LIKE);
			preparedStatement.setString(1, flag+"%");
			resultSet =  preparedStatement.executeQuery();
			employees = new ArrayList<>();
			while(resultSet.next()) {
				Employee employee = new Employee();
				employee.setEid(resultSet.getInt(1));
				employee.setEname(resultSet.getString(2));
				employee.setEsal(resultSet.getDouble(3));
				employees.add(employee);
			}
			return employees;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			ConnectionUtil.close(resultSet, preparedStatement, connection);
		}
		return null;
	}

}
