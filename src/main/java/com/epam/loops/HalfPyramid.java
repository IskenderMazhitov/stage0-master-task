package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for(int i=0; i<cathetusLength; i++)
        {
            int j;
            for(j=2*(cathetusLength-i); j>=0; j--)
            {
                System.out.print(" ");
            }
            for(j=0; j<=i; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
