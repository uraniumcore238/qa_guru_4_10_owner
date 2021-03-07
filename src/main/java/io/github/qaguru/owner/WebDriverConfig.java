package io.github.qaguru.owner;

import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config {

    @Key("WebdriverUrl")
    String GetWebdriverUrl();

    @Key("WebdriverBrowser")
    String GetWebdriverBrowser();

    @Key("BaseUrl")
    String GetBaseUrl();

    @Key("Enabled")
    boolean isEnabled();

}
