package com.switchfully;

import com.switchfully.config.Parameters;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParameterProductionTest {

    Parameters parameters = new Parameters();

    @Test
    void canReadNameParameter() {
        Assertions.assertThat(parameters.getName()).isEqualTo("Production App");
    }

    @Test
    void canReadAddressParameter() {
        Assertions.assertThat(parameters.getPassword()).isEqualTo("VeryS#cr3t!");
    }

    @Test
    void canReadUrlParameter() {
        Assertions.assertThat(parameters.getUrl()).isEqualTo("http://switchfully.com");
    }
}
