package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTestNG {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(calc.add(3, 2), 5);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(calc.subtract(5, 3), 2);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(calc.multiply(4, 3), 12);
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(calc.divide(10, 2), 5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
          expectedExceptionsMessageRegExp = "Khong the chia cho 0")
    public void testDivideByZero() {
        calc.divide(10, 0);
    }

    @Test
    public void testParseNumber_Valid() {
        Assert.assertEquals(calc.parseNumber("123"), 123);
    }

    @Test(expectedExceptions = NullPointerException.class,
          expectedExceptionsMessageRegExp = "Chuoi dau vao la null")
    public void testParseNumber_NullInput() {
        calc.parseNumber(null);
    }

    @Test(expectedExceptions = NumberFormatException.class,
          expectedExceptionsMessageRegExp = "Dinh dang so khong hop le: abc")
    public void testParseNumber_InvalidFormat() {
        calc.parseNumber("abc");
    }

    @Test
    public void testIsPositiveInteger_True() {
        Assert.assertTrue(calc.isPositiveInteger(5));
    }

    @Test
    public void testIsPositiveInteger_False() {
        Assert.assertFalse(calc.isPositiveInteger(-3));
    }
}
