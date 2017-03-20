package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import com.cisc181.eNums.eTitle;
import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
		
		ArrayList<Staff> staffs = new ArrayList();
		Staff staff1 = new Staff(eTitle.MR);
		staff1.setSalary(20000);
		staffs.add(staff1);
		Staff staff2 = new Staff(eTitle.MRS);
		staff2.setSalary(30000);
		staffs.add(staff2);
		Staff staff3 = new Staff(eTitle.MS);
		staff3.setSalary(35000);
		staffs.add(staff3);
		Staff staff4 = new Staff(eTitle.MR);
		staff4.setSalary(28000);
		staffs.add(staff4);
		Staff staff5 = new Staff(eTitle.MRS);
		staff5.setSalary(34000);
		
		double average = 0;
		for (Staff staff : staffs){
			average += staff.getSalary()/staffs.size();
		}
		double testvalue = 20000+30000+35000+28000+34000;
		
		testvalue /= 5;
		
		assertEquals(average, testvalue);
		
	}
	
	@Test(expected = PersonException.class)
	public void testDOB() throws PersonException{
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, 120);
		Staff staff = new Staff(eTitle.MR);
		staff.setDOB(calendar.getTime());
	}	
	
	@Test(expected = PersonException.class)
	public void TestPhone() throws PersonException{
		Staff staff = new Staff(eTitle.MR);
		staff.setPhone("(123)456-7890");
	}

}
