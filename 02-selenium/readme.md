# Selenium

## Homepage and introduction
- homepage: https://www.selenium.dev/
- About & Ecosystem
  - Selenium Webdriver
  - Selenium IDE
  - Selenium Grid
- Architecture:
  - [Components](https://www.selenium.dev/documentation/overview/components/) 
  - [Details](https://www.selenium.dev/documentation/overview/details/)

## Create automation project using Selenium

### Simple scenario

```java
    System.out.println("Hello and welcome!");
    WebDriver driver = new ChromeDriver();
    driver.get("https://selenium.dev");
    Thread.sleep(3000);
    driver.quit();
    System.out.println("Goodbye!");
```

### Different ways to create a WebDriver instance
- Using default constructor: new ChromeDriver()
- Using service and options: new ChromeDriver(service, options)

### Create RemoteWebDriver instance to run tests on a remote machine

```java
    System.out.println("Hello and welcome!");
    FirefoxOptions options = new FirefoxOptions();
    options.setBinary("/Users/username/.cache/selenium/firefox/mac-arm64/138.0/Firefox.app/Contents/MacOS/firefox");
    WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
    driver.get("https://selenium.dev");
    Thread.sleep(3000);
    driver.quit();
    System.out.println("Goodbye!");
```

## Exercise
1. Write 3 classes to run selenium with below scenario in different browsers (Chrome, Firefox, Edge)
Scenario:
- Open Browser
- Navigate to "https://github.com"
- Wait for 4 seconds
- Quit Browser

2. WebDriver class has 2 methods: quit() and close()
   1. Write the code to try these 2 methods
   2. What is the difference between these 2 methods?

3. Study ChromeDriverService to use start() and stop()
4. How many ways to create an instance of
   1. ChromeDriver
   2. FirefoxDriver
   3. EdgeDriver
   4. RemoteWebDriver
Hint: checking constructors in javadoc or source code.