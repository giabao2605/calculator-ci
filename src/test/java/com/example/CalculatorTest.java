package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(6, 0);
        });
        assertEquals("Khong the chia cho 0", exception.getMessage()); 
    }

    @Test
    void testInvalidNumberFormat() {
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            calc.parseNumber("abc");
        });
        assertEquals("Dinh dang so khong dung: abc", exception.getMessage()); 
    }

    @Test
    void testNullPointerException() {
        Exception exception = assertThrows(NullPointerException.class, () -> { 
            calc.parseNumber(null);
        });
        assertEquals("Chuoi dau vao la null", exception.getMessage()); 
    }

    @ParameterizedTest
    @CsvSource({
        "5, true",
        "0, false",
        "-3, false",
        "10, true",
        "-1, false"
    })
    void testIsPositiveInteger(int input, boolean expected) {
        assertEquals(expected, calc.isPositiveInteger(input));
    }
}
