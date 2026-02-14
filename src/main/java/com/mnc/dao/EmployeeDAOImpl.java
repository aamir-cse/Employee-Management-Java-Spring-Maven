package com.mnc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mnc.bo.EmployeeBO;

public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String REAL_TIME_DI_EMPLOYEE_INSERT = 
	"insert into REAL_TIME_EMPLOYEEMGMT VALUES(EMP_SEQ.NEXTVAL ,?,?,?,?,?)";

	private DataSource dmds;

	public EmployeeDAOImpl(DataSource dmds) {
		System.out.println("Employee DAO 1-Param constructor created");
		this.dmds = dmds;
	}

	@Override
	public int insert(EmployeeBO bo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int count =0;
		try {
			//Get pooled JDBC connection object
			con = dmds.getConnection();
			//Create prepared statement object using pre-compiled SQL query
			ps = con.prepareStatement(REAL_TIME_DI_EMPLOYEE_INSERT);
			ps.setString(1, bo.getEmpName());
			ps.setString(2, bo.getEmpAddress());
			ps.setFloat(3, bo.getEmpBaseSalary());
			ps.setFloat(4, bo.getGrossSalary());
			ps.setFloat(5, bo.getNetSalary());
			
			//Execute the query
			count = ps.executeUpdate();
			
		}catch(SQLException se)
		{
			se.printStackTrace();
			throw se;
		}catch(Exception e)//For unknow exception
		{
			e.printStackTrace();
			throw e;
		}
		finally {
			
			try {
				if(ps != null)
				{
					ps.close();
				}
			}catch(SQLException e)
			{
				e.printStackTrace();
				throw e;
			}
			
			try {
				if(con != null)
				{
					con.close();
				}
			}catch(SQLException e)
			{
				e.printStackTrace();
				throw e;
			}
			
		}
		return count;
	}

	

}
