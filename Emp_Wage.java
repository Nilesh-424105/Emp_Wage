package com.bridgelabz;

/**
 * 
 * // Calculate Wages till a condition of total working hours or days is reached
 * for a month
 *
 */
public class Emp_Wage {
	public static void main(String[] args) {
		// introducing variable as a constant
		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;
		final int EMP_RATE_PER_HOUR = 20;
		final int NUM_OF_WORKING_DAYS = 20;
		final int MAX_HRS_IN_MONTH = 100;

		// initializing variable
		int empHrs = 0, totalEmpWage = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		// computation
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println(" Day: " + totalWorkingDays);
			System.out.println(" Dailly Employee Hour: " + empHrs);
			System.out.println(" Total Employee hour: " + totalEmpHrs);
			System.out.println(" ");

		}
		totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println(" Calculate Employee Wages For a Month: " + totalEmpWage);

	}

}
