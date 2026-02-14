package com.mnc.service;

import com.mnc.bo.EmployeeBO;
import com.mnc.dao.EmployeeDAOImpl;
import com.mnc.dto.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	private EmployeeDAOImpl dao;
	
	public EmployeeMgmtServiceImpl(EmployeeDAOImpl dao) {
		this.dao = dao;
	}

	@Override
	public String calculateGrossAndNetSalary(EmployeeDTO dto) throws Exception {
		//Gross = Base + Allowances
		 float allowances = 100.0f;
         float grossSalary =dto.getBaseSalary()+allowances;
         float deduction = (dto.getBaseSalary()*12)/100.0f;
         float netSalary = grossSalary - deduction;
         
		 EmployeeBO bo = new EmployeeBO();
		 bo.setEmpName(dto.getEmpName());
		 bo.setEmpAddress(dto.getEmpAddress());
		 bo.setEmpBaseSalary(dto.getBaseSalary());
		 bo.setGrossSalary(grossSalary);
		 bo.setNetSalary(netSalary);
	  
		 int count =dao.insert(bo);
		 if(count == 1)
		 {
			 return "Employee data stored in DB successfully , "
			 		+ "Gross Salary :"+grossSalary+" , NetSalary ::"+netSalary;
		 }else
		 {
			 return "Employee data does not stored into DB ";
		 }
	  
	}

}
