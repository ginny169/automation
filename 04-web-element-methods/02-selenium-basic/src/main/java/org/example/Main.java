package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        WebDriver driver = new ChromeDriver();
        Exercise ex = new Exercise();

//        //1.
//        ex.trySendKeys(driver);
//
//        //2.
//        ex.usingGet(driver);

        //3.
        ex.getAmetByLorem(driver);

        driver.quit();

    }
}