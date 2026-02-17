package com.mnc.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mnc.controller.MainController;
import com.mnc.vo.EmployeeVO;

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

    	
//    	// create IOC container
        ClassPathXmlApplicationContext factory =
                new ClassPathXmlApplicationContext("com/mnc/cfgs/applicationContext.xml");
    	//Get Controller class object from IOC container
      	MainController controller = factory.getBean("controller", MainController.class);

      	//System.out.println(Arrays.toString(factory.getBeanDefinitionNames()));
      	//Invoke method.
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
