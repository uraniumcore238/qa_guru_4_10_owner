package io.github.qaguru.owner;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SystemPropertyTest {

    @Test
    @Disabled
    public void testSystemProperty(){
       assertThat(System.getProperty("browser")).isEqualTo("firefox");

    }
}
