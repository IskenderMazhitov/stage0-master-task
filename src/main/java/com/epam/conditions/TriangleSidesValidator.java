package com.epam.conditions;

public class TriangleSidesValidator {

  public void validate(double firstSide, double secondSide, double thirdSide) {
    if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0){
      System.out.println("it's not a triangle");
      return;
    }

    if (firstSide + secondSide > thirdSide
        && firstSide + thirdSide > secondSide
        && secondSide + thirdSide > firstSide) {
      System.out.println("this is a valid triangle");
      return;
    }
    System.out.println("it's not a triangle");


  }

  public static void main(String[] args) {
    new TriangleSidesValidator().validate(1, 10, 12); // invalid
    new TriangleSidesValidator().validate(3, 5, 4); // valid

  }

}
