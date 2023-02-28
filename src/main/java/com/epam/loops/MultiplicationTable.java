package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        System.out.println("Multiplication Table: ");
        System.out.println("______________________");
        for(int i = 1; i <= numberTableToPrint; i++){
            for (int j = 1; j <= numberTableToPrint; j++) {
                if (j * i == numberTableToPrint){
                    System.out.println(i + " * " + j + " = " + numberTableToPrint);
                }
            }
        }
        System.out.println("______________________");
    }

    public static void main(String[] args) {
        new MultiplicationTable().printTable(8);
    }

}
