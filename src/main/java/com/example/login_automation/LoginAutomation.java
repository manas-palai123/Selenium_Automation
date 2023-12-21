package com.example.login_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAutomation {
    public static void main(String[] args) {
    	// Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "F:/WebScarpining/WEB_TESTING/chromedriver-win64/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--whitelisted-ips=");
        
        // Create a new instance of the Chrome driver
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10); // 10 seconds timeout
        
        // Navigate to the login page
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Find the username and password input fields and login button
      //WebElement usernameInput = driver.findElement(By.name("username"));
        WebElement usernameInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[placeholder='Username']")));
        usernameInput.isDisplayed();
        usernameInput.isEnabled();
        // Enter your username
        usernameInput.sendKeys("Admin");
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.isDisplayed();
        passwordInput.isEnabled();
        // Enter your password
        passwordInput.sendKeys("admin123");
        //Find submit button
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

       
        
        
        // Click the login button
        loginButton.click();

        // Wait for a while to see the result (you might want to use explicit waits in a real scenario)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}