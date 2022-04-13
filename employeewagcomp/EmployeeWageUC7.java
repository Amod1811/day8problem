package com.bridgelabz.employeewagcomp;

public class EmployeeWageUC7 {

	
	private static int PART_TIME_PRESENT =2;
	private static int PART_TIME_WORK_HR =4;
	private static int FULL_TIME_PRESENT =1;
	private static int FULL_TIME_WORK_HR =8;
	private static int SALARY_PER_HR =25;
	 
    
    	 
       
    	   public static void getAttendance() {
    			int checkStatus = (int) (Math.floor(Math.random() * 10) %  2);
    			if(checkStatus == 0)
    				System.out.println("emp is absent");
    			else
    				System.out.println("emp is present");
    			}
                   public static void getPartTime() {
                	int workHr;
    				int dailyWage;
    				double emp = Math.floor(Math.random() * 10) %  3;
    				if (emp == 	FULL_TIME_PRESENT) {
    				System.out.println("Employee is present");
    				workHr = FULL_TIME_WORK_HR;
    				}
    				else if (emp == PART_TIME_PRESENT) {
    					System.out.println("Employee is part timer");
    					workHr = PART_TIME_WORK_HR;
    				}
    				else{
    				System.out.println("Employee is absent");
    				workHr = 0;
    				}
    				
    				dailyWage= (SALARY_PER_HR * workHr);
    				System.out.println("salary will be" + dailyWage);
    				}
    		     public static void main(String args[]) {
    		    	 getAttendance();
    		    	 getPartTime();
    		     }
    		 }
       