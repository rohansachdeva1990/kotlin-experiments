package com.rohan.java.section2;

public class DummyClass {

    public String isVacationTime(boolean onVacation) {
        return onVacation ? "I'm on Vacation" : "I am working";
    }

    public void printNumber(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

}
