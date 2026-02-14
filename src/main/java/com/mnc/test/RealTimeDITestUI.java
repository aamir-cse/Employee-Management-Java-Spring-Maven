package com.mnc.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.mnc.vo.EmployeeVO;
import com.mnc.controller.MainController;

public class RealTimeDITestUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Employee Name ::");
      String name = sc.nextLine();
      System.out.println("Enter Employee Address ::");
      String addrs = sc.nextLine();
      System.out.println("Enter Employee Base Salary ::");
      String baseSalary = sc.nextLine();
      
      //Creating VO object 
      EmployeeVO vo = new EmployeeVO();	
      vo.setEmpName(name);
      vo.setEmpAddress(addrs);
      vo.setEmpBaseSalary(baseSalary);
      
    //Create IOC container (ApplicationContext container)
    	DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
    	//Load Bean class file to IOC
    	XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
    	reader.loadBeanDefinitions("com/mnc/cfgs/applicationContext.xml");
    	//Get Controller class object from IOC container
      	MainController controller = factory.getBean("controller", MainController.class);
      
      	//Invoke method
      	try {
      		String result = controller.processEmployee(vo);
      		System.out.println(result);
      	}
      	catch(Exception e)
	  	{
	  		e.printStackTrace();
	  		System.out.println("Internal Problem:: Try again"+e.getMessage());
	  	}
	  	sc.close();
	}

}
