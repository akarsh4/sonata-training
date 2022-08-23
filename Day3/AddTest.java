package co.sonata.inf;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sonata.impl.EmpImpl;
import com.sonata.model.EmployeeModel;

public class AddTest {
	@Test
	public void addTest() {
		EmployeeModel e1 = new EmployeeModel();
		e1.setEmpSal(10);
		EmpImpl e2 = new EmpImpl();
		Assertions.assertEquals(120, e2.yearlySal(e1));
	}
	@Test
	public void addTest2() {
		EmployeeModel e3 = new EmployeeModel();
		e3.setEmpSal(100);
		EmpImpl e4 = new EmpImpl();
		Assertions.assertEquals(1200, e4.yearlySal(e3));
	}

}
