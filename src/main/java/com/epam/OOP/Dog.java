package com.epam.OOP;

public class Dog extends Animal{

  public Dog(){
    super("brown", 4, true);
  }

//  public Dog(String color, int numberOfPaws, boolean hasFur) {
//    super(color, numberOfPaws, hasFur);
//  }

  public static void main(String[] args) {
    System.out.println(new Dog().getDescription());
  }

}
