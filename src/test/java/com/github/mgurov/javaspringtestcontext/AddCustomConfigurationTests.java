package com.github.mgurov.javaspringtestcontext;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Ignore //NB: disabled by default
public class AddCustomConfigurationTests {

    @Test
    public void test1() {
    }

    @Test
    public void test2() {
    }

    @Test
    public void test3() {
    }

    @TestConfiguration
    public static class CustomConfiguration {
        @Bean
        public HeavierBean customOrOverriddenBean() {
            return new HeavierBean(500L);
        }
    }
}
