package com.testing.practiveTest.service;

public class serviceCalculate {

    public static int add(int a, int b, String testHasBeenFailed) {
        return a + b;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static String checkString(String str) { return str; }

    public static int add(int a, int b) { return a + b; }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for(int i:arr) sum += i;
        return sum;
    }
}
