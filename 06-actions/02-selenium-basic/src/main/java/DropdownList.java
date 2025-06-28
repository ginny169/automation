import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownList {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.get("file:///Users/tando/projects/COURSES/1-1-training/05-waits/dropdown.html");

        Thread.sleep(2000);
        WebElement selectElement = driver.findElement(By.name("selectomatic"));
        Select select = new Select(selectElement);
        System.out.println("single select: " +select.getAllSelectedOptions().get(0).getText());
//        select.selectByIndex(2);
//        select.selectByValue("two");
//        select.selectByVisibleText("Two");
//        select.selectByContainsVisibleText("Tw");

//        Thread.sleep(2000);
//        select.deselectByIndex(2);

        // multi select
//        WebElement multiSelectElement = driver.findElement(By.name("multi"));
//        Select multiSelect = new Select(multiSelectElement);
//        List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
//        for (WebElement selectedOption : selectedOptions) {
//            System.out.println(selectedOption.getText());
//        }
//
//        multiSelect.selectByIndex(1);
//
//        Thread.sleep(2000);
//        multiSelect.deselectByIndex(1);
//
//        Thread.sleep(2000);
//        multiSelect.deselectAll();
//
//        Thread.sleep(5000);

        // disabled option
        WebElement disabledSelectElement = driver.findElement(By.name("single_disabled"));
        Select disabledSelect = new Select(disabledSelectElement);
        disabledSelect.selectByIndex(1);
        driver.quit();



    }
}
