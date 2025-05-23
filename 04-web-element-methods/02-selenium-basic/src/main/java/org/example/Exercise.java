package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Exercise {
    /*
Exercise 1
Open https://the-internet.herokuapp.com/key_presses
Enter text "Selenium Automation Test Training" using Keys.
 */
    public void trySendKeys(WebDriver driver) throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/key_presses");
        WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
        input.sendKeys(Keys.chord("Selenium Automation Test Training"), Keys.ENTER);
        Thread.sleep(5000);
    }

    public static void getAttributes(WebElement element){
        System.out.println(element.getSize());
        System.out.println(element.getCssValue("color"));
        System.out.println(element.getCssValue("background-color"));
        System.out.println(element.getCssValue("font-family"));
        System.out.println(element.getCssValue("font-size"));
        System.out.println(element.getCssValue("border-color"));
        System.out.println(element.getCssValue("margin"));
    }

    public void usingGet(WebDriver driver){
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
        WebElement button = driver.findElement(By.className("button"));
        WebElement button2 = driver.findElement(By.className("button alert"));

        WebElement buttonAlert = driver.findElement(By.xpath("//a[@class='button alert']"));
        WebElement buttonSuccess = driver.findElement(By.xpath("//a[@class='button success']"));
        getAttributes(button);
        getAttributes(buttonAlert);
        getAttributes(buttonSuccess);
    }
    //Open https://the-internet.herokuapp.com/challenging_dom
    //Find a cell in Amet colmn where Lorem = "Iuvaret5", and then print the text to console. Expected: "Consequuntur5"

    public void getAmetByLorem(WebDriver driver){
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
        //cach 1: Duyet toàn bộ bảng, tìm index của cột Amet sau đó đi xuống từng row và tìm Lorem có giá trị Iuvaret5, ở row đó lấy giá trị index bằng Amet.
        List<WebElement> headers = driver.findElements(By.xpath("//tr/th"));
        int indexAmet = -1;
        for (int i = 0; i < headers.size(); i++){
            if (headers.get(i).getText().equals("Amet")){
                indexAmet = i;
                break;
            }
        }

        String xpath = String.format("//tr/td[text()='Iuvaret5']/following-sibling::td[%d]",indexAmet);
        System.out.println(driver.findElement(By.xpath(xpath)).getText());

        //cach 2 dung xpath tương đối
        String xpath2 = ("//tr/td[text()='Iuvaret5']/following-sibling::td[count(//th[text()='Amet']/preceding::th)]");
        System.out.println("Cách 2: " + driver.findElement(By.xpath(xpath2)).getText());
    }
}
