package com.sonata.impl;

import com.sonata.model.EmployeeModel;

import co.sonata.inf.empIntf;

public class EmpImpl implements empIntf{

	@Override
	public double yearlySal(EmployeeModel e1) {
		double ysal;
		ysal = e1.getEmpSal()*12;
		return ysal;
	}

	@Override
	public double appSal(EmployeeModel e1) {
		// TODO Auto-generated method stub
		double asal;
		if(e1.getEmpSal()<10000) {
			asal = 5000;
		}
		else {
			asal = 1000;
		}
		return asal; 
	}
	
}
