package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int res = 0;
        while(number != 0){
            int mode = number % 10;
            res = mode + res * 10;
            number = number/10;
        }
        System.out.println(res);


    }

    public static void main(String[] args) {
        new NumberReverter().revert(435);
    }

}
