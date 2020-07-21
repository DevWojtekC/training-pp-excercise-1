package com.excercise.game.pp1;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.IntStream;

import static com.excercise.game.pp1.Exercise1.Counter.BUZZ;
import static com.excercise.game.pp1.Exercise1.Counter.FIZZ;

public class Exercise1 {

    @AllArgsConstructor
    public enum Counter {
        FIZZ(3, "Fizz"), BUZZ(5, "BUZZ");
        public final int pos;
        public final String name;
    }

    public static void main(String[] args) {
        Exercise1 test = new Exercise1();
        IntStream.range(0, 100).forEach(i -> System.out.println(test.generate(i)));
    }

    public String generate(int count) {
        if (count % FIZZ.pos == 0) {
            return FIZZ.name;
        }
        if (count % BUZZ.pos == 0) {
            return BUZZ.name;
        }
        return String.valueOf(count);
    }
}
