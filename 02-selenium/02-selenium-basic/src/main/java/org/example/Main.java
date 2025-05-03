package org.example;
import java.net.MalformedURLException;

public class Main {

/* 1.Write 3 classes to run selenium with below scenario in different browsers (Chrome, Firefox, Edge) Scenario:
- Open Browser
- Navigate to "https://github.com"
- Wait for 4 seconds
- Quit Browser */
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        RunOnChrome run1 = new RunOnChrome();
        run1.openGitOnChrome();

//        RunOnFirefox runFf = new RunOnFirefox();
//        runFf.openGitOnFirefox();

//        RunOnEdge runE = new RunOnEdge();
//        runE.openGitonEdge();
    }
}