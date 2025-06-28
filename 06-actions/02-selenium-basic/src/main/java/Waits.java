import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Waits {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/tando/projects/COURSES/1-1-training/05-waits/wait.html");

        // implicit wait
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
//
//        driver.findElement(By.id("btn1")).click();
//        driver.findElement(By.id("delayedElement"));
//
//        // click btn2
//        driver.findElement(By.id("btn2")).click();
//
//        // get text of dynamic element
//        driver.findElement(By.id("dynamicElementcontainer1")); // 3s
//        Thread.sleep(5000);
//
//
//        // get text after 5 seconds
//        driver.findElement(By.id("btn3")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//        driver.findElement(By.id("dynamicElementcontainer2")); // 5s
//
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
//        driver.findElement(By.id("dynamicElementcontainer3")); // 7s
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));


        // Explicit wait
        // click btn2
//        driver.findElement(By.id("btn2")).click();
//
//        // get text of dynamic element
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicElementcontainer1")));
//
//        driver.findElement(By.id("btn3")).click();
//        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofMillis(5000));
//        WebElement element2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicElementcontainer2")));
//
//        // clickable
//        driver.findElement(By.id("addButton")).click();
//
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofMillis(5000));
//        long start = System.currentTimeMillis();
//        WebElement element3 = wait3.until(ExpectedConditions.elementToBeClickable(By.id("dynamicButton"))); // 7
//        long end = System.currentTimeMillis();
//        System.out.println("time: " + (end - start));
//        element3.click();
//        Thread.sleep(5000);

        // combination
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.findElement(By.id("btn3")).click();

        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofMillis(7000));
        long start2 = System.currentTimeMillis();

//        List<String> list = new ArrayList<>(); // <E>, <T>: Java Generics
//        List<Integer> list2 = new ArrayList<>();
        try {
            WebElement element4 = wait4.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("dynamicElementcontainer2")) // Java Function
            );
        } catch (TimeoutException e) {
            System.out.println("timeout");
        }
        long end2 = System.currentTimeMillis();
        System.out.println("time: " + (end2 - start2));
//        System.out.println(element4.getText());

        // explicit
//        while(timeout > 0){ // 4s
//            try{
//                return driver.findElement(By.id("btn4")); // 3s
//            } catch (NoSuchElementException | StaleElementReferenceException var3) {
//
//            }
//
//        }

        // lần 1: tìm element mất 3s -> ko thấy
        // lần 2: tìm tiếp element mất 3s
        // - nếu ko tìm thay thi phai doi (3 + 3 = 6s)
        // - nếu tìm thấy, thì phải đợi (3s + 2s = 5s)

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(customWait(By.id("btn4"), "Displayed"));

        driver.quit();
    }

    static ExpectedCondition<Boolean> customWait(final By locator, final String text) {
        return new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                try {
                    String title = driver.getTitle();
                    if (title != null && title.equals("Selenium")) {
                        return true;
                    }
                    return false;
                } catch (StaleElementReferenceException var3) {
                    return false;
                }
            }

            public String toString() {
                return String.format("text ('%s') to be present in element found by %s", text, locator);
            }
        };
    }

}

