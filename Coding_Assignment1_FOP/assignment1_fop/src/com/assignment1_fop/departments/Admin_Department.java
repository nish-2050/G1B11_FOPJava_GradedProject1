package com.assignment1_fop.departments;

/*→ Admin department will contain 3 methods of return type String and will not accept any
parameter
i) departmentName
ii) getTodaysWork
iii) getWorkDeadline
departmentName will return “ Admin Department “
getTodaysWork will return “Complete your documents Submission”
getWorkDeadline will return “ Complete by EOD “
 */
public class Admin_Department extends Super_Department {
	/*
	 * Super Department class will be the superclass and all other departments must
	 * extend it
	 */
	public String departmentName() {
		return "Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your documents submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

}
