package dev.atomicrepos.java.hello_world;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloTest {
    @Test
    public void testApp() {
        assertThat(new Hello().sayHello()).isEqualTo("Hello, World!");
    }
}
