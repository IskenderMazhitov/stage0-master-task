package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (month <= 0 || month > 12 || year < 0){
            System.out.println("invalid date");
        }

        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 2:
                int caseOfLeap = (year % 4 == 0) && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
                System.out.println(caseOfLeap);
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
        }



    }

    public static void main(String[] args) {
        new DaysInMonth().printDays(2400, 3);
    }

}
