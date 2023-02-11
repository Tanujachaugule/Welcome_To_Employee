package com.wage;
import java.util.ArrayList;
public class UseCase9 {
    public static String company ;
    public final int empRatePerHr;
    public final int numberOfWorkingDays;
    public final int maxHrPerMonth;
    public static int totalEmpWage;
    ArrayList<Integer> dailyWage = new ArrayList<Integer>();

    public UseCase9(String company, int empRatePerHr, int numberOfWorkingDays, int maxHrPerMonth) {
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.numberOfWorkingDays = numberOfWorkingDays;
        this.maxHrPerMonth = maxHrPerMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    public String toString() {
        return "Total employee wages for: " + company + " is " + totalEmpWage;
    }

    public static void main(String[] args) {
        System.out.println("Total employee wages" + company + " is " + totalEmpWage );
    }

}
