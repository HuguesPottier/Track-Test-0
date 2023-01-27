package com.switchfully.suite.tests;

import com.switchfully.config.Counter;
import com.switchfully.config.TestConfig;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstCounterTest {

    private Counter counter =  new Counter();

    @Test
    @Order(1)
    void theStartingValueOfTheCounterIs0() {
        assertThat(counter.getCounter()).isEqualTo(0);
    }

    @Test
    @Order(2)
    void increasingTheCounterTheFirstTime_willSetItTo1() {
        counter.increaseCounter();

        assertThat(counter.getCounter()).isEqualTo(1);
    }
}
