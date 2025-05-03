package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunOnChrome {
    public void openGitOnChrome() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        //using closed()
        driver.get("https://vi.wikipedia.org/");
        WebDriver newTab = driver.switchTo().newWindow(WindowType.TAB);
        newTab.get("https://github.com");
        Thread.sleep(2000);
        driver.close(); //--> chỉ đóng tab hiện tại.

        //dùng quit()

        WebDriver driver2 = new ChromeDriver();

        driver2.get("https://vi.wikipedia.org/");
        WebDriver newTab2 = driver2.switchTo().newWindow(WindowType.TAB);
        newTab2.get("https://github.com");
        Thread.sleep(2000);
        driver.quit(); // --> đóng cả browsers

    }
}
