package com.example.docker_demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    HelloController controller = new HelloController();

    @Test
    void testHelloMessage() {
        assertNotNull(controller.hello());
    }

    @Test
    void testContainsDocker() {
        assertTrue(controller.hello().contains("Docker"));
    }

    @Test
    void testStartsCorrectly() {
        assertTrue(controller.hello().startsWith("Aplicação"));
    }

    @Test
    void testLength() {
        assertTrue(controller.hello().length() > 5);
    }

    @Test
    void testEqualsMessage() {
        assertEquals("Aplicação rodando com Docker 🚀", controller.hello());
    }
}