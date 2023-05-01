package com.switchfully;

import com.switchfully.config.Parameters;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParameterTest {

    Parameters parameters = new Parameters();

    @Test
    void canReadNameParameter() {
        Assertions.assertThat(parameters.getName()).isEqualTo("Development App");
    }

    @Test
    void canReadAddressParameter() {
        Assertions.assertThat(parameters.getPassword()).isEqualTo("password");
    }

    @Test
    void canReadUrlParameter() {
        Assertions.assertThat(parameters.getUrl()).isEqualTo("http://development.switchfully.com");
    }
}
