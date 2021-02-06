package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void myFirstUnitTest() {
		int x = 10;
		int y = 5 +5;
		System.out.println(x==y);
    }

}
