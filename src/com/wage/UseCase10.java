package com.wage;

public class UseCase10 {
    public static final int IS_FULL_TIME=1;
    public static final int IS_PART_TIME=2;
    public static final int EMP_RATE_PER_HOUR=20;
    public static final int NUM_OF_WORKING_DAYS=20;
    public static final int MAX_HRS_IN_MONTH=100;
    public static void calculateEmpWage(String company,int empRate,int numbOfDays,int maxHrs){
        //Variables
        int empHrs=0,totalWorkingDays=0;
        int empWage=0;
        int totalEmpWage=0,totalEmpHrs=0;
        while(totalEmpHrs<=maxHrs &&  totalWorkingDays < numbOfDays){
            for(int day=0;day<NUM_OF_WORKING_DAYS;day++){
                totalWorkingDays++;
                //COMPUTATION
                double empCheck=Math.floor(Math.random()*10)%3;
                switch ((int)empCheck){

                    case IS_FULL_TIME:
                        empHrs=8;
                        break;

                    case IS_PART_TIME:
                        empHrs=4;
                        break;

                    default:
                        empHrs=0;
                }
                empWage=EMP_RATE_PER_HOUR*empHrs;
                totalEmpHrs+=empHrs;
                System.out.println(" Employee Wage "+empWage);
                System.out.println(totalWorkingDays+ " "+empHrs);
            }
            //System.out.println(" Total Employee Wage "+totalEmpWage);
            totalEmpWage=totalEmpHrs*empRate;
            System.out.println(" Total Employee Wage "+ " " + " Comapny is"+ company +totalEmpWage);
        }
    }

    public static void main(String args[]){
        calculateEmpWage("DMart",20,2,10);
        calculateEmpWage("Reliance",30,3,20);
    }
}

//This is end of Muiltiple Companies code
