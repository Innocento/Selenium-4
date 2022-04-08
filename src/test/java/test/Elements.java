package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;
import java.util.List;

public class Elements {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(16));

        driver.get("https://trytestingthis.netlify.app/");

        // Defining waits
        WebElement searchBox = driver.findElement(By.name("gender"));
        searchBox.sendKeys("YOU THERE");

        // Multiple elements
        List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
        for (WebElement element : options) {
            System.out.println(element.getText());
        }

        // Using CSS selector
        driver.findElement(By.cssSelector("#lname")).sendKeys("Omido");

        // Using Relative Locators
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

        // Relative Locators
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginButton)).sendKeys("pass");

        driver.quit();


    }
}
