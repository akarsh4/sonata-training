package com.sonata.Day3;


public class EmplImp extends Employee implements EmpIntf{

	int salary=10000;
	@Override
	public double skillBonus(int subjects) {
		// TODO Auto-generated method stub
		int salary=10000;
		double upgradedSal=0;
		switch(subjects) {
		case 1:upgradedSal =(int)(salary+0.1*salary);
		break;
		case 2: upgradedSal= (int)(salary+0.2*salary);
			break;
		case 3: upgradedSal=(int)(salary+0.3*salary);
			break;
		 }
		return upgradedSal;
	}
	@Override
	public void salCal() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String args[]) {
		EmplImp e1 = new EmplImp();
		System.out.println("upgrded salary is "+ e1.skillBonus(3));
	}
}
