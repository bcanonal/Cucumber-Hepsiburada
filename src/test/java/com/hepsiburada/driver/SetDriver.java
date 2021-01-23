package com.hepsiburada.driver;

import com.hepsiburada.configuration.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class SetDriver {

    public static WebDriver driver;
    public static String driverName;

    public static WebDriver initializeDriver() {
        try {
            driverName = Config.getValue("driver");
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (driverName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\geckodriver.exe");
            return driver = new FirefoxDriver();
        } else if (driverName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
            return driver = new ChromeDriver();
        }
        return null;
    }
}
