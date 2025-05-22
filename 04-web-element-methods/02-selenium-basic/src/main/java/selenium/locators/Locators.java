package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello and welcome!");

        WebDriver driver = new ChromeDriver();
        // get current path
        String path = System.getProperty("user.dir") + "/sample-html/locators.html";
        driver.get("file://" + path);

        // html element
        // <tag_name attribute="value" attribute2="value2" attribute3="value3"></tag_name>

        // find element by id
        WebElement e = driver.findElement(By.id("lbl_firstName"));
        // driver.findElement(new By.ById("lbl_firstName")).click();
        System.out.println("label: " + e.getText());

        // find element by name
        e = driver.findElement(By.name("gender"));
        System.out.println("name: " + e.getAttribute("value"));

        List<WebElement> elements = driver.findElements(By.name("gender"));
        for (WebElement element : elements) {
            System.out.println("name: " + element.getAttribute("value"));
        }

        // find element by tag name
        e = driver.findElement(By.tagName("input"));
        System.out.println("tag name: " + e.getAttribute("type"));
        // find element by link text
        e = driver.findElement(By.linkText("Selenium Official Page"));
        System.out.println("link text: " + e.getText());
        // find element by partial link text
        e = driver.findElement(By.partialLinkText("Selenium"));
        System.out.println("partial link text: " + e.getText());

        // find element by xpath: //tag_name[@attribute='value']
        // absolute xpath
        e = driver.findElement(By.xpath("/html/body/form/input"));
        System.out.println("absolute xpath: " + e.getAttribute("type"));

        // relative xpath
        e = driver.findElement(By.xpath("//input"));
        System.out.println("relative xpath: " + e.getAttribute("type"));

        // combine xpath
        e = driver.findElement(By.xpath("/html/body//input"));
        System.out.println("combine xpath: " + e.getAttribute("type"));

        // relative xpath with attribute
        e = driver.findElement(By.xpath("//input[@type='text']"));
        System.out.println("relative xpath with attribute: " + e.getAttribute("name"));

        // //input[@type='text']
        // //input[contains(@type,'text')]
        e = driver.findElement(By.xpath("//input[contains(@type,'text')]"));
        System.out.println("relative xpath with attribute: " + e.getAttribute("name"));

        // and vs or
        e = driver.findElement(By.xpath("//input[@type='text' and @class='information']"));
        System.out.println("and: " + e.getAttribute("name"));

        e = driver.findElement(By.xpath("//input[@type='text1' or @class='information']"));
        System.out.println("or: " + e.getAttribute("name"));


        driver.get("https://demo.guru99.com/test/selenium-xpath.html");
        // //*[text()='Enterprise Testing']//ancestor::div
        List<WebElement> elements2 = driver.findElements(By.xpath("//*[text()='Enterprise Testing']//ancestor::div"));
        System.out.println(elements2.size());


        driver.quit();
    }
}
