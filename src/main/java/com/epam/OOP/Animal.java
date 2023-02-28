package com.epam.OOP;

public class Animal {

  private String color;
  private int numberOfPaws;
  private boolean hasFur;

  public Animal(String color, int numberOfPaws, boolean hasFur) {
    this.color = color;
    this.numberOfPaws = numberOfPaws;
    this.hasFur = hasFur;
  }

  public String getDescription() {
    var hasFurToString = this.hasFur ? "a" : "no";
    var pluralSuffix = this.numberOfPaws == 1 ? "" : "s";
    var description = String.format(
        "This animal is mostly %s. It has %d paw%s and %s fur.",
        this.color, this.numberOfPaws, pluralSuffix,hasFurToString);
    return description;
  }

  public static void main(String[] args) {
    var animal = new Animal("black", 4, true);
    System.out.println(animal.getDescription());
  }
}
