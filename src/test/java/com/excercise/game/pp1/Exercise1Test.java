package com.excercise.game.pp1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


class Exercise1Test {

    Exercise1 sut = new Exercise1();

    @Test
    void thirdIsFizz() {
        String result = sut.generate(3);

        assertEquals("Fizz", result);
    }

    @Test
    void fifthIsBuzz() {
        fail("Not implemented");
    }

    @Test
    void thirdAndFifthIsFizzBuzz() {
        fail("Not implemented");
    }
}