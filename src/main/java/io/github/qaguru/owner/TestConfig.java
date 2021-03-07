package io.github.qaguru.owner;

public class TestConfig {

    public String GetWebdriverUrl(){
        return System.getProperty("WebdriverUrl");
    }

    public String GetWebdriverBrowser(){
        return System.getProperty("WebdriverBrowser");
    }

    public String GetBaseUrl(){
        return System.getProperty("BaseUrl");
    }
}
