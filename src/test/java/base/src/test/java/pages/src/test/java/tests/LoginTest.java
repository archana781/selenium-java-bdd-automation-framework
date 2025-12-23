package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void verifyValidLogin() {
        driver.get("https://example.com/login");
        LoginPage login = new LoginPage(driver);
        login.login("testuser", "password");
    }
}
