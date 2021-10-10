package ru.dataart.academy.java;

import org.junit.jupiter.api.Test;

public class ReverseIntegerTest {
    @Test
    public void test(){
        ReverseInteger reverseInt = new ReverseInteger();
        assert(reverseInt.reverse(123) == 321);
        assert(reverseInt.reverse(-123) == -321);
        assert(reverseInt.reverse(0) == 0);
        assert(reverseInt.reverse(1) == 1);
        assert(reverseInt.reverse(-1) == -1);
        assert(reverseInt.reverse(120) == 21);
        assert(reverseInt.reverse(102) == 201);
    }
}
