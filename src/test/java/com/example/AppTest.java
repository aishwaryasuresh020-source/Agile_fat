package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testPaymentSuccess() {
        App app = new App();
        assertTrue(app.processPayment(1000, "1234567812345678"));
    }

    @Test
    public void testInvalidAmount() {
        App app = new App();
        assertFalse(app.processPayment(-500, "1234567812345678"));
    }

    @Test
    public void testInvalidCard() {
        App app = new App();
        assertFalse(app.processPayment(1000, "1234"));
    }
}
