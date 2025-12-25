package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        driver.get("https://example.com");
        LoginPage lp = new LoginPage(driver);
        lp.login("testuser", "password");
    }
}
