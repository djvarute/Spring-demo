package com.DBConnection.spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeImpl {

	public List<Employee> getEmployeeList(DBConnection dbConnection) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Employee> employeeList = null;
		Employee e = null;
		try {

			conn = DriverManager.getConnection(dbConnection.getConnectionURL(), dbConnection.getUsername(),
					dbConnection.getPassword());

			stmt = conn.createStatement();

			String insertQuery = "select * from employee";
			rs = stmt.executeQuery(insertQuery);

			employeeList = new ArrayList<Employee>();

			while (rs.next()) {
				e = new Employee();
				e.setEmployeeId(rs.getInt(1));
				e.setEmoloyeeName(rs.getString(2));
				e.setDepartment(rs.getString(3));
				e.setSalary(rs.getLong(4));
				e.setGender(rs.getString(5));
				e.setAge(rs.getInt(6));
				e.setCity(rs.getString(7));
				employeeList.add(e);
			}
		} catch (SQLException ex) {
			ex.getMessage();

		} finally {

			try {
				rs.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}

			try {
				stmt.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}

			try {
				conn.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}

		}

		return employeeList;
	}

}
