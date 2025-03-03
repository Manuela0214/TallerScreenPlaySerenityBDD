package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverSetup {

    private static WebDriver driver;

    public static WebDriver initializeDriver() {

        if (driver != null) {
            driver.quit();
        }
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*","test-type", "no-sandbox", "ignore-certificate-errors", "--start-maximized",
                "incognito", "disable-infobars", "disable-gpu", "disable-default-apps", "disable-popup-blocking",
                "disable-dev-shm-usage", "disable-extensions", "disable-web-security", "disable-translate", "disable-logging");

        return new ChromeDriver(options);
    }
}
