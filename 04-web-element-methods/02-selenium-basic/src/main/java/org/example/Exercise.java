package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {
    /*
Exercise 1
Open https://the-internet.herokuapp.com/key_presses
Enter text "Selenium Automation Test Training" using Keys.
 */
    public void trySendKeys(String text) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/key_presses");
        WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
        input.sendKeys(text, Keys.ENTER);
        Thread.sleep(2000);
        driver.quit();
    }

    public void getAttributes(WebElement element){
        System.out.println(element.getSize());
        System.out.println(element.getCssValue("color"));
        System.out.println(element.getCssValue("background-color"));
        System.out.println(element.getCssValue("font-family"));
        System.out.println(element.getCssValue("font-size"));
        System.out.println(element.getCssValue("border-color"));
        System.out.println(element.getCssValue("margin"));
    }
    //Open https://the-internet.herokuapp.com/challenging_dom
    //Find a cell in Amet colmn where Lorem = "Iuvaret5", and then print the text to console. Expected: "Consequuntur5"

    public String getAmetByLorem(String lorem){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
        String xpath = "//tr/td[text()='"+lorem+"']/following-sibling::td[4]";
        WebElement element = driver.findElement(By.xpath(xpath));
        return element.getText();
      //  driver.quit(); ?
    }
}
