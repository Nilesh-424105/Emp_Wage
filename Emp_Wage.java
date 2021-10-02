package com.bridgelabz;

/**
 * 
 * // Calculating Wages For a Month
 *
 */
public class Emp_Wage {
	public static void main(String[] args) {
		// introducing variable as a constant
		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;
		final int EMP_RATE_PER_HOUR = 20;
		final int NUM_OF_WORKING_DAYS = 20;

		// initializing variable
		int empHrs = 0, empWage = 0, totalEmpWage = 0;
		// computation
		for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
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
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Emp Wage: " + empWage);
			totalEmpWage += empWage;
		}
		System.out.println("Total Emp Wage: " + totalEmpWage);
	}

}
