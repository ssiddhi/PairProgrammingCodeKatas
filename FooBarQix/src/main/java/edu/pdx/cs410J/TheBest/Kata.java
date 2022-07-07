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

  public static String divisibleBy3(int number) {
    if(number % 3 == 0) {
      return "Foo";
    }
    return "notFoo";
  }
}