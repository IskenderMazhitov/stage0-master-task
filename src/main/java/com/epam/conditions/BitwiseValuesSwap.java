package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
        first = first ^ second ^ (second = first);
        System.out.println(first);
    }

    public static void main(String[] args) {
        new BitwiseValuesSwap().swap(3, 4);
    }

}
