package edu.pdx.cs410J.TheBest;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }

  // method to implement divisibility by 3
  public static String divisibleBy3(int number) {
    if(number % 3 == 0) {
      return "Foo";
    }
    return "";
  }

  // method to implement divisibility by 5
  public static String divisibleBy5(int num) {
    if (num % 5 == 0) {
      return "Bar";
    }
    return "";
  }
}