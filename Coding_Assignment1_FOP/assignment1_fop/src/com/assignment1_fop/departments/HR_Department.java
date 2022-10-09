package com.assignment1_fop.departments;

/* → Hr department will contain 4 methods of return type String and will not accept any
parameter
i) departmentName
ii) getTodaysWork
iii) getWorkDeadline
iv) doActivity
departmentName will return “ Hr Department “
getTodaysWork will return “ Fill today’s timesheet and mark your attendance”
getWorkDeadline will return “ Complete by EOD “
doActivity “team Lunch”
 */
public class HR_Department extends Super_Department {
	/*
	 * Super Department class will be the superclass and all other departments must
	 * extend it
	 */

	public String departmentName() {
		return "HR Department";
	}

	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "team Lunch";
	}

}
