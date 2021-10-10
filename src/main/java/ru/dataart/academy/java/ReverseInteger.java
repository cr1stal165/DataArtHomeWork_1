package ru.dataart.academy.java;

import java.lang.Integer;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber){

        int reverseNum = 0;
        while (inputNumber != 0) {
            int popNumber = inputNumber % 10;
            inputNumber /= 10;

            if(Math.abs(inputNumber) > Integer.MAX_VALUE){
                throw new RuntimeException("Введите число из нужного диапазона!");
            }
            if (reverseNum > Integer.MAX_VALUE / 10 || (reverseNum == Integer.MAX_VALUE / 10 && popNumber > 7)){
                return 0;
            }
            if (reverseNum < Integer.MIN_VALUE / 10 || (reverseNum == Integer.MIN_VALUE / 10 && popNumber < -8)){
                return 0;
            }

            reverseNum = reverseNum * 10 + popNumber;
        }
        return reverseNum;
    }
}
