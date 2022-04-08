package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup {


    public static void main(String[] args) {

        // Setting up chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Getting a url using the get method
        driver.get("https://google.com");
        String originalWindow = driver.getWindowHandle();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        // navigating a site by using the navigate method
        driver.navigate().to("https://github.com");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        // Get with of a browser
        driver.manage().window().getSize().getWidth();
        driver.manage().window().getSize().getWidth();
        Dimension size = driver.manage().window().getSize();
        System.out.println(size.getWidth());
        System.out.println(size.getHeight());

        // maximize, minimize and full screen of window
        driver.manage().window().setPosition(new Point(500, 100));

        // Clossing the brp
        driver.quit();

    }

}
