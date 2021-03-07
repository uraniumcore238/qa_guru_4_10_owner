package io.github.qaguru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ConfigurationTest {

    @Test
    public void testConfiguration() {
//        final String localWebdriwerUrl = "http://localhost:4444";
//        final String remoteWebdrivwrUrl = "https://selenoid.compsny.com";
//        final String webdriverBrowserChrome = "chrome";
//        final String webdriverBrowserFirefox = "firefox";
//        final String baseUrlTesting = "http://testing.github.com";
//        final String baseUrlDev = "http://dev.github.com";

        final WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

        assertThat(config.GetWebdriverUrl()).isEqualTo("http://localhost:4444");
        assertThat(config.GetWebdriverBrowser()).isEqualTo("firefox");
        assertThat(config.GetBaseUrl()).isEqualTo("http://testing.github.com");
        assertThat(config.isEnabled()).isEqualTo(true);
    }


}