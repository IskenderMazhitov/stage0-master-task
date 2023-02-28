package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for(int i=0; i<cathetusLength; i++)
        {
            int j;
            for (j = 1; j <= cathetusLength - i; j++){
                System.out.print(" ");

            }
            for (j = cathetusLength - j + 2; j>1; j--){
                System.out.print(j);
            }
            int n = 1;
            for(int z=0; z<=i; z++)
            {

                System.out.print(n);
                n++;
            }
            System.out.println();
        }



    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
