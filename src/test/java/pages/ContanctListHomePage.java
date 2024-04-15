package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContanctListHomePage {

    WebDriver ldriver;

    By logOutById = By.id("logout");

    public ContanctListHomePage(WebDriver gdriver) {

        ldriver = gdriver;

    }

    public void clickLogOut() {

        ldriver.findElement(logOutById).click();
    }
}
