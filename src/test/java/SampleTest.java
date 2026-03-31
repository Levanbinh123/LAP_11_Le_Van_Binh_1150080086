
import com.test.mavenproject4.ConfigUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest {
    WebDriver driver;

  @BeforeClass
public void setup() {
    String browser = System.getProperty("browser", "chrome");
    driver = DriverFactory.createDriver(browser);
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
    @Test
public void loginTest() {
    driver.get("https://www.saucedemo.com");

    String username = ConfigUtil.getUsername();
    String password = ConfigUtil.getPassword();

    // nhập vào form login
}
}