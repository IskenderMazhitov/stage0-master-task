package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0){
            System.out.println("division by zero");
            return;
        }
        int res = dividend / divider;
        if (res * divider != dividend || dividend == 0) {
            System.out.println("cannot be divided completely");
            return;
        }
        System.out.println("can be divided completely");

    }

    public static void main(String[] args) {
        new IntegerDivider().printCompletelyDivided(0, 4);
    }

}
