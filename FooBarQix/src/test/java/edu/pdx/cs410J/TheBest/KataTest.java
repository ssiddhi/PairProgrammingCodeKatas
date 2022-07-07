package edu.pdx.cs410J.TheBest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class KataTest
{

  @Test
  void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  void isDivisibleBy3DoesNotContain3(){
    int number = 9;
    Kata myKata = new Kata();
    assertThat(myKata.divisibleBy3(number), is("Foo"));
  }

}
