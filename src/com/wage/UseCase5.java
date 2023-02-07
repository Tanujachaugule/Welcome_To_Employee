package com.wage;

public class UseCase5 {
    private static int workingHrs;
    //private static Object i;
    public static void main(String args[])
    {
        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        final int WAGE_PER_HR = 20;
        final int WORKING_DAYS = 20;
        final int MAX_WORKING_DAYS = 20;
        final int MAX_WORKING_HRS = 100;
        int totalWage = 0;
        for (int day = 1; day <= WORKING_DAYS; day++) {
        }
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");
        for (int day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_DAYS
                && totalWorkingHrs < MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs)
        {
            int empType = (int) (Math.random() * 100) % 3;
            int workingHours =0;
            switch (empType)
            {
                case FULL_TIME:
                    workingHours = 8;
                    break;
                case PART_TIME:
                    workingHours = 4;
                    break;
                default:

                    // int Duplicate_2 = 0;
                    //int getDuplicate2 = 0;
                    //case getDuplicate2 FULL_TIME:
                    //  workingHrs = 8;
                    //break;
                    //case PART_TIME_2:
                    //  workingHrs = 4;
                    //break;
                    //default_2:
                    workingHrs = 0;
                    break;
            }
            int wage = workingHours * WAGE_PER_HR;
            System.out.println("Day " + day + " wage is:" + wage);
            // int wage = workingHrs * WAGE_PER_HR;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);
        }
        System.out.println("Total wage for a month is " + totalWage);
        System.out.println("Total wage for a month is " + totalWage);
    }
    private static int getDuplicate2(int Duplicate_2) {
        return Duplicate_2;
    }
}


