package com.mnc.controller;

import com.mnc.dto.EmployeeDTO;
import com.mnc.service.IEmployeeMgmtService;
import com.mnc.vo.EmployeeVO;

public class MainController {
   private IEmployeeMgmtService service;

   public MainController(IEmployeeMgmtService service) {
	this.service = service;
   }
   
   public String processEmployee(EmployeeVO vo) throws Exception
   {
	   EmployeeDTO dto = new EmployeeDTO();
	   dto.setEmpName(vo.getEmpName());
	   dto.setEmpAddress(vo.getEmpAddress());
	   dto.setBaseSalary(Float.parseFloat(vo.getEmpBaseSalary()));
	   
	   //Use Service
	   String result = service.calculateGrossAndNetSalary(dto);
	   return result;
   }
   
}
