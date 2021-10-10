package ru.dataart.academy.java;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TwoSumTest {
    @Test
    void test() {
        TwoSums twoSums = new TwoSums();
        int[] result = twoSums.getTwoSum(new int[]{2, 3}, 1);
        assert (result.length == 0);

        result = twoSums.getTwoSum(new int[]{1}, 1);
        assert (result.length == 0);

        result = twoSums.getTwoSum(new int[]{4, 7, 10, 12, 26}, 19);
        assert (Arrays.equals(result, new int[]{7, 12}));

        result = twoSums.getTwoSum(new int[]{4, 4, 10, 12, 26}, 8);
        assert (Arrays.equals(result, new int[]{4, 4}));
    }
}
