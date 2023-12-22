package com.example.login_automation;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginAutomation {
	@Test
	public void testOnChrome() {
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

	@Test
	public void testOnFirefox() {
		// Set the path to the firfox geckodriver executable
	    System.setProperty("webdriver.gecko.driver", "F:/WebScarpining/WEB_TESTING/geckodriver.exe");
	    FirefoxOptions options = new FirefoxOptions();
	    options.addArguments("--whitelisted-ips=");
	    
	    // Create a new instance of the Chrome driver
	    WebDriver driver = new FirefoxDriver(options);
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
	@Test
	public void testOnEdge() {
		// Set the path to the firfox geckodriver executable
	    System.setProperty("webdriver.edge.driver", "F:/WebScarpining/WEB_TESTING/msedgedriver.exe");
	    EdgeOptions options = new EdgeOptions();
	   
	    // Create a new instance of the Chrome driver
	    WebDriver driver = new EdgeDriver(options);
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
    public static void main(String[] args) {
    	LoginAutomation browser = new LoginAutomation();
    	browser.testOnChrome();
    	//browser.testOnFirefox();
    	browser.testOnEdge();
    }
}