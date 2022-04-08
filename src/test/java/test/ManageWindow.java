package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindow {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Get the URL
        driver.get("https://google.com");

        // Manage Windows screen size
        driver.manage().window().setPosition(new Point(500, 100));

        // Maximize window
        driver.manage().window().maximize();
        // Minimize window
        driver.manage().window().minimize();
        // Set Full screen
        driver.manage().window().fullscreen();

        driver.close();


    }
}
