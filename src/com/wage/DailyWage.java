package com.wage;


public class DailyWage {
    public static void main(String[] args) {

        int isPresent = 0;
        int isAbsent = 1;
        int  dailysalary;
        int  workHours;
        int salaryPerhours=20;

        int checkAttendance =(int)((Math.E*10)%2);
        int checkAtteendance =(int)((Math.random()*10)%2);
        if (checkAttendance==isPresent) {
            System.out.println("employee is Present");
            workHours=8;
        }
        else{
            System.out.println("employee is Absent");
            workHours=0;
        }

        dailysalary = workHours*salaryPerhours;
        System.out.println("daily Salary is " + dailysalary);
    }
}
