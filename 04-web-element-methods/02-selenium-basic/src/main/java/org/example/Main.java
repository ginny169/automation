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
        Exercise ex = new Exercise();
        //1.
        String text = "Selenium Automation Test Training";
        ex.trySendKeys(text);

        //2.
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
        WebElement button = driver.findElement(By.className("button"));
        WebElement buttonAlert = driver.findElement(By.xpath("//a[@class='button alert']"));
        WebElement buttonSuccess = driver.findElement(By.xpath("//a[@class='button success']"));
        ex.getAttributes(button);
        ex.getAttributes(buttonAlert);
        ex.getAttributes(buttonSuccess);
        driver.quit();

        //3.
        System.out.println(ex.getAmetByLorem("Iuvaret5"));
    }
}