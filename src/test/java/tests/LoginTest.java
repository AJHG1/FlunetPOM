package tests;

import dev.failsafe.internal.util.Durations;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ContactListLogInPage;

import java.time.Duration;

public class LoginTest {


    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        ContactListLogInPage logInPage = new ContactListLogInPage(driver);


        logInPage
                .enterEmail("sdatest@tester.com")
                .enterPassword("tester.123")
                .clickSubmit()
                .clickLogOut();
    }
}
