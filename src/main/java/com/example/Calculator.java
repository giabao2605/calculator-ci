package com.example;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Khong the chia cho 0");
        }
        return a / b;
    }

    public int parseNumber(String input) {
        if (input == null) {
            throw new NullPointerException("Chuoi dau vao la null"); 
        }
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Dinh dang so khong hop le: " + input);
        }
    }



    public boolean isPositiveInteger(int number) { 
        return number > 0;
    }
}
//Demo test branch
