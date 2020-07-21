package com.excercise.game.pp1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.excercise.game.pp1.Exercise1.Counter.BUZZ;
import static com.excercise.game.pp1.Exercise1.Counter.FIZZ;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


class Exercise1Test {

  Exercise1 sut = new Exercise1();

  @Test
  @DisplayName("test 1 -> 1")
  void firstIsOne() {
    assertEquals("1", sut.generate(1));
  }

  @Test
  @DisplayName("test 3 -> Fizz")
  void thirdIsFizz() {
    String result = sut.generate(3);

    assertEquals(FIZZ.name, result);
  }

  @Test
  @DisplayName("test 5 -> Buzz")
  void fifthIsBuzz() {
    assertEquals(BUZZ.name, sut.generate(5));
  }

  @Test
  @DisplayName("test 15 -> Fizz\\nBuzz")
  void thirdAndFifthIsFizzBuzz() {
    assertEquals(
        String.format("%s\n%s", FIZZ.name, BUZZ.name),
        sut.generate(15)
    );

  }
}