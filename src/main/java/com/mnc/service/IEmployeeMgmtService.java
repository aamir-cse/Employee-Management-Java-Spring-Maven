package com.mnc.service;

import com.mnc.dto.EmployeeDTO;

public interface IEmployeeMgmtService {
   public String calculateGrossAndNetSalary(EmployeeDTO dto) throws Exception;
}
