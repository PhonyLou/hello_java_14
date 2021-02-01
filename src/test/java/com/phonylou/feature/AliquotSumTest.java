package com.phonylou.feature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.IntStream.range;

public class AliquotSumTest {
    @Test
    void should_return_factors_given_a_real_number() {
        var realNumber = 6;
        var factorNumbers = List.of(1, 2, 3, 6);

        Assertions.assertEquals(factorNumbers, factorOf(realNumber).boxed().collect(Collectors.toList()));
    }

    @Test
    void should_return_aliquot_numbers_sum_given_a_real_number() {
        var realNumber = 6;
        var expectedAliquotNumberSum = 6;

        Assertions.assertEquals(expectedAliquotNumberSum, aliquotNumberSum(realNumber));
    }

    public static int aliquotNumberSum(int realNumber) {
        return factorOf(realNumber).sum() - realNumber;
    }

    public static IntStream factorOf(int number) {
        return range(1, 1 + number).filter(n -> number % n == 0);
    }
}
