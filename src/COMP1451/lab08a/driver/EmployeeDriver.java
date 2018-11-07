package COMP1451.lab08a.driver;

import COMP1451.lab08a.data.*;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		Employee hourlyEmployee = new HourlyEmployee("abc","edf", 160);
		Employee commissionEmployee = new CommissionEmployee("uvw", "xyz", 0.5, 20000);
		
		System.out.println(hourlyEmployee.calculateMonthlyEarnings());
		System.out.println(commissionEmployee.calculateMonthlyEarnings());

	}

}
