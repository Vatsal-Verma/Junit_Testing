package com.testing.practiveTest.service;

import jakarta.xml.bind.SchemaOutputResolver;
import org.junit.jupiter.api.*;

public class serviceCalculateUnit5Test {

    @Test
    public void productTest() {
        int result = serviceCalculate.product(1, 3);
        int expected = 3;

        Assertions.assertEquals(expected, result);
        System.out.println("result :" + result);
        System.out.println("expected:" + expected);
        // Assertions.assertNot
    }

    @Test
    public void sumArrayTest() throws Exception{

        try {
            int result = serviceCalculate.sumArray(new int[]{3, 4, 5});
            int expected = 12;

            Thread.sleep(3000);
            Assertions.assertEquals(expected, result);
        }

        catch (Exception e) {
            System.out.println(e);
        }
 
    }

    @Test
    public void addTest() {
        int result = serviceCalculate.add(2,3) ;
        int expected = 5;

        Assertions.assertEquals(expected, result, "this test is brutally failed");
        System.out.println("result :" + result);
        System.out.println("expected:" + expected);

    }


    @BeforeAll
    public static void BeforeTest() {
        System.out.println("this will run beofre all tests");
    }


    @AfterAll
    public static void AfterTest() {
        System.out.println("this will run after all tests");
    }

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("this will run before each test");
    }

    @AfterEach
    public void afterEachTest() {
        System.out.println("this will run after each test");
    }


}
