package com.mnc.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{
	
	private String empName;
	private String empAddress;
	private float baseSalary;
	
	//Generate Getter and Setter
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

	public float getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [empName=" + empName + ", empAddress=" + empAddress + ", baseSalary=" + baseSalary + "]";
	}
	

}
