package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void testIsEvenNumber() {
        App app = new App();
        assertTrue(app.isEvenNumber(2));
        assertTrue(app.isEvenNumber(4));
    }

    @Test
    void testIsOddNumber() {
        App app = new App();
        assertFalse(app.isEvenNumber(3));
    }
}
