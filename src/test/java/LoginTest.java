/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import com.test.mavenproject4.ConfigUtil;
import com.test.mavenproject4.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setup() {
        String browser = System.getProperty("browser", "chrome");
        driver = DriverFactory.createDriver(browser);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void loginSuccess() {
        loginPage.open();

        String username = ConfigUtil.getUsername();
        String password = ConfigUtil.getPassword();

        loginPage.login(username, password);

        // Kiểm tra login thành công
        assert driver.getCurrentUrl().contains("inventory");
    }

    @AfterClass
    public void teardown() {
        if (driver != null) driver.quit();
    }
}