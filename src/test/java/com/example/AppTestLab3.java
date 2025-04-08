package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTestLab3 {

    @BeforeAll 
    static void initAll() {
        System.out.println("@BeforeAll - Chay truoc tat ca cac methods");
    }

    @BeforeEach 
    void init() {
        System.out.println("@BeforeEach - Chay truoc cac methods");
    }

    @DisplayName("First test")
    @Test
    void testMethod1() {
        System.out.println("Test method 1");
    }

    @Test
    @Disabled
    void testMethod2() {
        System.out.println("Test method 2");
    }

    @Test
    void testMethod3() {
        System.out.println("Test method 3");
    }

    @AfterEach 
    void tearDown() {
        System.out.println("@AfterEach - Chay sau moi methods test");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("@AfterAll - Chay sau tat ca cac methods test");
    }
}
