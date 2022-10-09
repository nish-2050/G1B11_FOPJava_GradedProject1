package com.assignment1_fop.app;

import com.assignment1_fop.departments.*;

public class Main {
	public static void main(String[] args) {
		/*
		 * Driver class Main will be used to create objects of HrDepartment,
		 * TechDepartment, AdminDepartment
		 */
		Admin_Department admin = new Admin_Department();
		// → Each department will display all its functionalities.
		System.out.println(" Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		/*
		 * → Each department will display whether today is a holiday or not with the
		 * help of the Super Department. (SuperDepartment will act as a super class for
		 * all the departments
		 */
		System.out.println(admin.isTodayAHoliday());
		System.out.println("");

		HR_Department hr = new HR_Department();
		System.out.println(" Welcome to " + hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println("");

		Tech_Department tech = new Tech_Department();
		System.out.println(" Welcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());

	}

}
