package org.example;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverService;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        // before version 4.0.0
        // 1. download chromedriver from https://chromedriver.chromium.org/downloads
        // 2. set the path of chromedriver in the system property "webdriver.chrome.driver"
//        System.setProperty("webdriver.chrome.driver", "/Users/tando/.cache/selenium/chromedriver/mac-arm64/135.0.7049.114/chromedriver");
        // 3. create a ChromeDriver instance
//        WebDriver driver = new ChromeDriver();

        // create chromedriver instance with service and options
//        ChromeDriverService service = new ChromeDriverService();
//        service.start();
//        service.stop();
//        service.setExecutable("/Users/tando/.cache/selenium/chromedriver/mac-arm64/135.0.7049.114/chromedriver");
//        // config port
//        service.setPort(9515);
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--window-size=720,1080");
//
//        WebDriver driver = new ChromeDriver(service, options);

        // create remote web driver instance to automate chrome browser
        String url = "http://localhost:25663";
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("/Users/tando/.cache/selenium/firefox/mac-arm64/138.0/Firefox.app/Contents/MacOS/firefox");
//        Capabilities capabilities = options;

//        WebDriver driver = new RemoteWebDriver(new URL(url), options);

        // 4. navigate to the URL and wait for the page to load
//        driver.get("https://www.google.com/");
//        Thread.sleep(5000);
        // 5. quit the driver
//        driver.quit();

//        // after version 4.0.0
        System.out.println("Hello and welcome!");

        WebDriver driver = new ChromeDriver(); // Java interface: define contract
        // abstract:
        // layer 1: test script -> abstract interface (giao diện): WebDriver
        // layer 2: selenium
//        ChromeDriver driver = new ChromeDriver();

        driver.get("https://selenium.dev");
        String winHandleBefore = driver.getWindowHandle();

        WebDriver tab1 = driver.switchTo().newWindow(WindowType.TAB);
        tab1.get("https://github.com");
        driver.close();

        driver.switchTo().window(winHandleBefore);

        WebDriver tab2 = driver.switchTo().newWindow(WindowType.TAB);
        tab2.get("https://github.com");
        tab2.close();
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Goodbye!");
    }
}