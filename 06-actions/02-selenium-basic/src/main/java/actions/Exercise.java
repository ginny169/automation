package actions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Exercise {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
 //       exercise1(driver);
        exercise2(driver);
        driver.quit();
    }

    public static void exercise1(WebDriver driver) throws InterruptedException {
        /* Open https://the-internet.herokuapp.com/jqueryui/menu
        Hover to show all menu items: Enabled > Downloads
        Click on CSV item */
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
        Actions actions = new Actions(driver);

        driver.get("https://the-internet.herokuapp.com/jqueryui/menu");


        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Enabled']")));
        actions.moveToElement(element)
                .perform();

        WebElement downloadButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Downloads']")));
        actions.moveToElement(downloadButton)
                .perform();

        WebElement csvButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='CSV']")));
        actions.click(csvButton)
                .perform();

        Thread.sleep(2000);
    }

    public static void exercise2(WebDriver driver) throws InterruptedException {
        /* Open https://www.youtube.com/@seleniumconf/videos
            Scroll down until a video with title "Lightning Talks - Marcus Merrell, Sauce Labs" displayed
            Click on that video */
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
        Actions actions = new Actions(driver);

        driver.get("https://www.youtube.com/@seleniumconf/videos");
        Thread.sleep(5000);
        //cach 1
//        WebElement origin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Selenium Conference']")));
//        WheelInput.ScrollOrigin initialPos = WheelInput.ScrollOrigin.fromElement(origin);
//
//        actions.scrollFromOrigin(initialPos,0,2700)
//                .perform();
//
//        WebElement expectedElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@title, 'Marcus Merrell')]")));
//        expectedElement.click();

        //cach 2
        for (int i = 0; i < 20; i++) {
            WebElement current = driver.findElement(By.xpath("//span[text()='You']")); // hoặc một phần tử đang hiển thị
            WheelInput.ScrollOrigin origin = WheelInput.ScrollOrigin.fromElement(current);
            Thread.sleep(1000);
            actions.scrollFromOrigin(origin, 0, 1000)
                    .perform();
            try {
                WebElement video = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@title, 'Marcus Merrell')]")));
                video.click();
                break;
            } catch (NoSuchElementException e) {
                System.out.println("scroll next" + i);
            }
        }

        Thread.sleep(5000);
    }
}
