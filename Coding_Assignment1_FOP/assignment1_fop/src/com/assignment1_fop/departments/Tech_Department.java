package com.assignment1_fop.departments;
/* → Tech department will contain 4 methods of return type String and will not accept any
parameter
i) departmentName
ii) getTodaysWork
iii) getWorkDeadline
iv) getTechStackInformation
departmentName will return “ Tech Department “
getTodaysWork will return “ Complete coding of module 1”
getWorkDeadline will return “ Complete by EOD “
getTechStackInformation will return “core Java”
 */

public class Tech_Department extends Super_Department {
	/*
	 * Super Department class will be the superclass and all other departments must
	 * extend it
	 */
	public String departmentName() {
		return "Tech Department";
	}

	public String getTodaysWork() {
		return "Complete coding of Module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTechStackInformation() {
		return " Core Java";
	}

}
