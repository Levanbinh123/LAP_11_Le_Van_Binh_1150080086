
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class SampleTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = DriverFactory.createDriver("chrome");
    }

    @Test
    public void openGoogle() {
        driver.get("https://www.google.com");
        assert driver.getTitle().contains("Google");
    }

    @AfterClass
    public void teardown() {
        if (driver != null) driver.quit();
    }
}