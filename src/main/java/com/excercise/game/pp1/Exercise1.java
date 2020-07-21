package com.excercise.game.pp1;

import java.util.stream.IntStream;

public class Exercise1 {

    public static final String FIZZ = "Fizz";

    public static void main(String[] args) {
        Exercise1 test = new Exercise1();
        IntStream.range(0, 100).forEach(i -> System.out.println(test.generate(i)));

    }

    public String generate(int count) {
        if (count % 3 == 0) {
            return FIZZ;
        }
        return String.valueOf(count);
    }
}
