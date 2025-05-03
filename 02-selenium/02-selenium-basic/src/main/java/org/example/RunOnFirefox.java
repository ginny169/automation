package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunOnFirefox {
    public void openGitOnFirefox() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://github.com");
        Thread.sleep(4000);
        driver.quit();
    }
}
