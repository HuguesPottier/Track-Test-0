package com.switchfully.suite.tests;

import com.switchfully.config.Counter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SecondCounterTest {

    private Counter counter = new Counter();

    @Test
    void whenTheCounterHasBeenIncreaseInTheFirstTestItWillStayAtThatNumber() {
        assertThat(counter.getCounter()).isEqualTo(1);
    }
}
