package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;
import java.util.Collections;

public class MouseActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

        WebElement clickable = driver.findElement(By.id("click"));

        // click and release
        // 1. Move mouse to element
        // 2. Click
//        new Actions(driver)
//                .click(clickable)
//                .perform();

        // click and release
//        new Actions(driver)
//                .pause(5000)
//                .moveToElement(clickable)
//                .pause(5000)
//                .click()
//                .perform();

        // click and hold
        // 1. Move mouse to element
        // 2. Click
        // 3. Hold mouse button
//        new Actions(driver)
//                .clickAndHold(clickable)
//                .perform();

        // context click: right click
//        new Actions(driver)
//                .contextClick(clickable)
//                .perform();

        // back click
//        PointerInput mouse = new PointerInput(PointerInput.Kind.MOUSE, "default mouse");
//
//        Sequence actions = new Sequence(mouse, 0)
//                .addAction(mouse.createPointerDown(PointerInput.MouseButton.BACK.asArg()))
//                .addAction(mouse.createPointerUp(PointerInput.MouseButton.BACK.asArg()));
//
//        ((RemoteWebDriver) driver).perform(Collections.singletonList(actions));

        // double click
//        WebElement doubleClickable = driver.findElement(By.id("clickable"));
//        new Actions(driver)
//                .doubleClick(doubleClickable)
//                .perform();

        // drag and drop
//        WebElement draggable = driver.findElement(By.id("draggable"));
//        WebElement droppable = driver.findElement(By.id("droppable"));
//        new Actions(driver, Duration.ofMillis(5000))
//                .dragAndDrop(draggable, droppable)
//                .perform();

        // drag and drop by locations
        new Actions(driver)
                .moveToLocation(100, 100)
                .pause(Duration.ofMillis(3000))
                .clickAndHold()
                .pause(Duration.ofMillis(3000))
                .moveToLocation(500, 500)
                .release()
                .perform();

        Thread.sleep(4000);
        driver.quit();
    }
}
