package com.mnc.bo;

public class EmployeeBO {
	private String empName;
	private String empAddress;
	private float empBaseSalary;
	private float grossSaalry;
	private float netSalary;
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
	public float getEmpBaseSalary() {
		return empBaseSalary;
	}
	public void setEmpBaseSalary(float empBaseSalary) {
		this.empBaseSalary = empBaseSalary;
	}
	public Float getGrossSalary() {
		return grossSaalry;
	}
	public void setGrossSalary(float grossSaalry) {
		this.grossSaalry = grossSaalry;
	}
	public Float getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(float netSalary) {
		this.netSalary = netSalary;
	}
	
	@Override
	public String toString() {
		return "EmployeeBO [empName=" + empName + ", empAddress=" + empAddress + ", empBaseSalary=" + empBaseSalary
				+ ", grossSaalry=" + grossSaalry + ", netSalary=" + netSalary + "]";
	}
	

}
