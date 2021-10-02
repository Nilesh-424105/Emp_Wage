package com.bridgelabz;

/**
 * 
 * // Solving Using Switch Case Statement
 *
 */
public class Emp_Wage {
	public static void main(String[] args) {
		// introducing variable as a constant
		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;
		final int EMP_RATE_PER_HOUR = 20;

		// initializing variable
		int empWage = 0, empHrs = 0;
		// computations
		int empCheck = (int) Math.floor(Math.random() * 10) % 3; // type casting(int) all belong to Number family
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
	}

}
