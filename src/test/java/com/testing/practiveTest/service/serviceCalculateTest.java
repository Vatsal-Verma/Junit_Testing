 package com.testing.practiveTest.service;
//
//import org.junit.*;
//import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

////import org.junit.jupiter.api.BeforeEach;
////
////import java.sql.Date;
////import java.sql.SQLOutput;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
public class serviceCalculateTest {
//
//    @Test(timeout = 3000)
//    public void addTest() throws InterruptedException {
//        int result = serviceCalculate.add(11, 11);
//        int expected = 22;
//        Thread.sleep(2000);
//        assertEquals(expected, result);
//        System.out.println("result:" + result);
//        System.out.println("expected:" + expected);
//    }
//
//    @Test
//    public void productTest() {
//        int result = serviceCalculate.product(2, 5);
//        int expected = 10;
//
//        assertEquals(expected, result);
//        System.out.println("result:" + result);
//        System.out.println("expected:" + expected);
//
//    }
//
//
//    @Test
//    public void checkStringTest() {
//        String result = serviceCalculate.checkString("vatsal");
//        String expected = "vatsal";
//
//        assertEquals(expected, result);
//        System.out.println("result:" + result);
//        System.out.println("expected:" + expected);
//
//    }
//
//    @BeforeClass
//    public static void testBefore() {
//        System.out.println("this will execute before everything");
//    }
//
//    @AfterClass
//    public static void testAfter() {
//        System.out.println("this will execute after everything");
//    }
//
//    @Before
//    public  void beforeTest() {
//        System.out.println("this will execute before every method");
//    }
//
//    @After
//    public void afterTest() {
//        System.out.println("this will execute after every method");
//    }

    @Test
    public void addTest() {
        int result = serviceCalculate.product(1 , 2);
        int expected = 2;
        Assertions.assertEquals(expected, result, "test has been failed");
    }

}
