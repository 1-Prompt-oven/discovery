package com.promptoven.discovery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DiscoveryApplicationTests {

    @Autowired
    private Environment env;

    // @Test
    // void contextLoads() {
    // }

    @Test
    void printTestValue() {
        String testValue = env.getProperty("test.value");
        System.out.println(testValue);
    }
}