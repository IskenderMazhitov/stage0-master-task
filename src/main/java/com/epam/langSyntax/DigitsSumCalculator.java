package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int res = 0;
        while (number != 0){
            int mode = number % 10;
            res += mode;
            number /= 10;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        new DigitsSumCalculator().calculateSum(1241);
    }

}
