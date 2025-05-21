package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsExercises {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        String path = System.getProperty("user.dir") + "/02-selenium-basic/sample-html/locators.html";
        driver.get("file://" + path);
        Thread.sleep(10000);
//
//        System.out.println("Following and Preceding");
        List<WebElement> listFollowingElements = driver.findElements(By.xpath("//label[text()='First name:']//following::input"));
        System.out.println("Following elements count (All nodes that come after the current note): " + listFollowingElements.size());

        List<WebElement> listPrecedingElements = driver.findElements(By.xpath("//label[text()='First name:']//preceding::input"));
        System.out.println("Preceding elements count (All nodes that come before the current note): " + listPrecedingElements.size());
        System.out.println();
//
//        System.out.println("Following and Descendant");
        List<WebElement> listFollowingElements1 = driver.findElements(By.xpath("//div[@class='information']//following::input"));
        System.out.println("Following elements count: " + listFollowingElements1.size());

        List<WebElement> listDescendantElements = driver.findElements(By.xpath("//div[@class='information']//descendant::input"));
        System.out.println("Descendant elements count(all nodes that come inside the current node) : " + listDescendantElements.size());
        System.out.println();

        // ancestor vs descendant
        System.out.println("Ancestor and Descendant");
        driver.get("https://demo.guru99.com/test/selenium-xpath.html");
        List<WebElement> listAncestorElements = driver.findElements(By.xpath("//b[text()='SAP']/ancestor::div"));
        System.out.println(listAncestorElements.size());

        List<WebElement> listDescendantElements3 = driver.findElements(By.xpath("//b[text()='SAP']/ancestor::div[1]/descendant::li"));
        System.out.println(listDescendantElements3.size());

        //following vs following-sibling
        System.out.println("following vs following-sibling");
        List<WebElement> listFollowingElements2 = driver.findElements(By.xpath("//a[text()='SAP Beginner']/ancestor::li/following::li"));
        System.out.println(listFollowingElements2.size());

        List<WebElement> listfollowingSiblingElements3 = driver.findElements(By.xpath("//a[text()='SAP Beginner']/ancestor::li/following-sibling::li"));
        System.out.println(listfollowingSiblingElements3.size());

        //preceding vs preceding-sibling
        System.out.println("preceding vs preceding-sibling");
        List<WebElement> listPrecedingElements2 = driver.findElements(By.xpath("//a[text()='SAP Basis']/ancestor::li/preceding::li"));
        System.out.println(listPrecedingElements2.size());

        List<WebElement> listPrecedingSiblingElements3 = driver.findElements(By.xpath("//a[text()='SAP Basis']/ancestor::li/preceding-sibling::li"));
        System.out.println(listPrecedingSiblingElements3.size());

        // parent vs ancestor
        System.out.println("parent vs ancestor");
        List<WebElement> listParentElements2 = driver.findElements(By.xpath("//b[text()='SAP']/parent::h4/parent::div"));
        System.out.println(listParentElements2.size());

        List<WebElement> listAncestorElements4 = driver.findElements(By.xpath("//b[text()='SAP']/ancestor::div"));
        System.out.println(listAncestorElements4.size());

        //preceding vs ancestor
        System.out.println("preceding vs ancestor");
        List<WebElement> listPrecedingElements3 = driver.findElements(By.xpath("//b[text()='SAP']/preceding::div"));
        System.out.println(listPrecedingElements3.size());
        List<WebElement> listAncestorElements5 = driver.findElements(By.xpath("//b[text()='SAP']/ancestor::div"));
        System.out.println(listAncestorElements5.size());

        driver.quit();

    }
}

