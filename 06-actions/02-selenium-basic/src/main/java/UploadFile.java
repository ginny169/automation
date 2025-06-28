import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));

        String path = "/Users/tando/projects/COURSES/1-1-training/05-waits/dropdown.html";
        fileInput.sendKeys(path);
        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}
