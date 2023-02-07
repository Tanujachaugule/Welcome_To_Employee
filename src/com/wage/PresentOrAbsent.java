package com.wage;

public class PresentOrAbsent {
    public static void main(String[] args) {


        int isPresent = 0;
        int isAbsent = 1;

        int checkAttendance =(int)((Math.E*10)%2);
        if (checkAttendance==isPresent) {
            System.out.println("employee is Present");
        }
        else{
            System.out.println("employee is Absent");
        }

    }
}
