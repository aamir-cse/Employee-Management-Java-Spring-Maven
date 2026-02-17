package com.mnc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mnc.dto.EmployeeDTO;
import com.mnc.service.IEmployeeMgmtService;
import com.mnc.vo.EmployeeVO;

@Controller("controller")
public class MainController {
	
  @Autowired
   private IEmployeeMgmtService service;
  
  
   
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
