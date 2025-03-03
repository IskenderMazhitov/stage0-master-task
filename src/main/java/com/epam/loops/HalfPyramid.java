package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for(int i=1; i<=cathetusLength; i++)
        {
            for (int j = cathetusLength-i-1; j >= 0; j--){
                System.out.print(" ");
            }

            for (int j = cathetusLength - i + 1; j <= cathetusLength; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
