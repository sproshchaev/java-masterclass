package com.prosoft.core.task01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    private final HelloWorld hw = new HelloWorld();

    @Test
    void shouldReturnCorrectGreeting() {
        assertEquals("Hello, Java 25!", hw.greet());
    }

    @Test
    void shouldNotBeEmpty() {
        assertFalse(hw.greet().isEmpty());
    }
}