package com.sonata.Main;

import com.sonata.impl.EmpImpl;
import com.sonata.model.EmployeeModel;

public class EmpExecute {

public static void main(String[] args) {
		// TODO Auto-generated method stub
EmployeeModel e1 = new EmployeeModel();
e1.setEmpId(123);
e1.setEmpName("Akarsh");
e1.setEmpSal(100);

 EmpImpl e2 = new EmpImpl();
System.out.println(e2.yearlySal(e1));
System.out.println(e2.appSal(e1));
	}
}
