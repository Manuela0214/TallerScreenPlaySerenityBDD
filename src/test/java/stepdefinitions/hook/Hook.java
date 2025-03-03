package stepdefinitions.hook;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

public class Hook {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
