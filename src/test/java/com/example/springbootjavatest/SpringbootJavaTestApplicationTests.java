package com.example.springbootjavatest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringbootJavaTestApplicationTests {

    @Test
    void contextLoads() {
        int a = 10;
        int b = 20; 
        assertEquals(35, a+b);
    }

}
