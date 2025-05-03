package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RunOnEdge {
    //chay hay bi loi k mở được add
    // dùng pkill -f "Microsoft Edge" để tránh trùng session
    public void openGitonEdge() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://github.com");
        Thread.sleep(4000);
        driver.quit();
    }
}
