package actions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardAction {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/single_text_input.html");

        Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;

        WebElement textField = driver.findElement(By.id("textInput"));
        new Actions(driver)
                .pause(Duration.ofMillis(4000))
                .sendKeys(textField, "Selenium!")
                .pause(Duration.ofMillis(2000))

                .sendKeys(Keys.ARROW_LEFT)
                .pause(Duration.ofMillis(2000))

                .keyDown(Keys.SHIFT) // giữ phím shift
                .sendKeys(Keys.ARROW_UP)
                .keyUp(Keys.SHIFT) // nhả phím shift
                .pause(Duration.ofMillis(2000))

                .keyDown(cmdCtrl) // giữ phím ctrl
                .sendKeys("c")
                .pause(Duration.ofMillis(2000))

                .sendKeys("v")
                .pause(Duration.ofMillis(2000))

                .sendKeys("v")
                .keyUp(cmdCtrl) // nhả phím ctrl
                .perform();

        Thread.sleep(4000);
        driver.quit();
    }
}
