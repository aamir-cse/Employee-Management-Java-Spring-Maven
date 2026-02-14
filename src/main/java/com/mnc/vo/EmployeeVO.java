package com.mnc.vo;

public class EmployeeVO {
	private String empName;
	private String empAddress;
	private String empBaseSalary;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpBaseSalary() {
		return empBaseSalary;
	}
	public void setEmpBaseSalary(String empBaseSalary) {
		this.empBaseSalary = empBaseSalary;
	}
	
	@Override
	public String toString() {
		return "EmployeeVO [empName=" + empName + ", empAddress=" + empAddress + ", empBaseSalary=" + empBaseSalary
				+ "]";
	}
	

}
