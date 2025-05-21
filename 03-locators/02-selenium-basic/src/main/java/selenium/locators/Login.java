package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.Map;

public class Login {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-default-browser-check");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--incognito"); // hoặc tạo user-data-dir riêng
        options.addArguments("start-maximized");
        options.addArguments("--disable-blink-features=AutomationControlled");

        options.addArguments("–-disable-save-password-bubble");

        options.setExperimentalOption("prefs", Map.of(
                "credentials_enable_service", false,
                "profile.password_manager_enabled", false
        ));
        WebDriver driver = new ChromeDriver(options);
//        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        //Login
        WebElement usename = driver.findElement(By.id("user-name"));
        usename.sendKeys("standard_user");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement submitLogin = driver.findElement(By.id("login-button"));
        submitLogin.click();
        Thread.sleep(2000);

        WebElement getText = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
        System.out.println(getText.getText());

        //Mua hang

        WebElement addToCart = driver.findElement(By.xpath("//button[text()='Add to cart'][1]"));
        addToCart.click();
        Thread.sleep(2000);

        WebElement addToCart2 = driver.findElement(By.xpath("//button[text()='Add to cart'][1]"));
        addToCart2.click();

        WebElement viewCart = driver.findElement(By.id("shopping_cart_container"));
        viewCart.click();
        Thread.sleep(2000);

        List<WebElement> cartItemCount = driver.findElements(By.className("cart_item"));
        System.out.println(cartItemCount.size());
        driver.quit();

    }
}

