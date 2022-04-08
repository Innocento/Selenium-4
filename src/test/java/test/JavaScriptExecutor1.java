package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor1 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://linkedin.com");

        // JavaScript Executor
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement signInButton  = driver.findElement(By.name("homepage-basic_signin-form_submit-button"));
        js.executeScript("arguments[0].click();", signInButton);

         //Writing on the console
        js.executeScript("console.log('Innocent on the deck')");

        driver.quit();
        driver.close();
    }
}
