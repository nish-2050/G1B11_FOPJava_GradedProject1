package com.assignment1_fop.departments;

/*→ Super department will contain 4 methods of return type String and will not accept any
parameter
i) departmentName
ii) getTodaysWork
iii) getWorkDeadline
iv) isTodayAHoliday
departmentName will return “ Super Department “
getTodaysWork will return “ No Work as of now”
getWorkDeadline will return “ Nil “
isTodayAHoliday will return “ Today is not a holiday”
*/
public class Super_Department {

	public String departmentName() {
		return "Super Department";
	}

	public String getTodayWork() {
		return "No Work as of now";
	}

	public String getWorkDeadline() {
		return "Nil";
	}

	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}

}
