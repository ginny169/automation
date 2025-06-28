import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.stream.Collectors;

public class WebElementMethods {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String path = System.getProperty("user.dir") + "/sample-html/locators.html";
        driver.get("file://" + path);

        WebElement e = driver.findElement(By.id("fname"));
        e.sendKeys(Keys.BACK_SPACE);
        e.sendKeys(Keys.BACK_SPACE);
        e.sendKeys(Keys.BACK_SPACE);
        e.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(5000);
        e.sendKeys("john smith");


        WebElement e5 = driver.findElement(By.xpath("//input[@type='radio' and @value='m']"));
        System.out.println("e: " + e5.isSelected()); // radio button
        e5.click();
        System.out.println("e: " + e5.isSelected());

        WebElement e1 = driver.findElement(By.id("lbl_firstName"));
        System.out.println("e1: " + e1.isSelected());
        Thread.sleep(20000);

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement e2 = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("e2: " + e2.isSelected()); // checkbox
        e2.click();
        System.out.println("label: " + e2.isSelected());

        driver.get("file:///Users/tando/projects/knowledge/web/selenium/demo.html");
        WebElement e3 = driver.findElement(By.id("delayedElement"));
        System.out.println("e3 is enabled: " + e3.isEnabled()); // present
        System.out.println("e3 is displayed: " + e3.isDisplayed());

        WebElement e4 = driver.findElement(By.id("btn1"));
        System.out.println("e4 css color: " + e4.getCssValue("color"));
        System.out.println("e4 css background-color: " + e4.getCssValue("background-color"));

        System.out.println("e4 location: " + e4.getLocation());
        System.out.println("e4 size: " + e4.getSize());
        System.out.println("e4 rect: " + e4.getRect());


        driver.quit();
    }
}
