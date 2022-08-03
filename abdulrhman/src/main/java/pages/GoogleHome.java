package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleHome {

    WebDriver driver;
    By googleLogoImage = By.xpath("//img[@alt='Google']");
    String url = "https://www.google.com/";
    By search = By.name("q");


    public GoogleHome(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate() {
        driver.navigate().to("https://www.google.com/");

    }

    public boolean isLogoDisplayed() {
        return driver.findElement(googleLogoImage).isDisplayed();
    }

    public String title() {
        return driver.getTitle();
    }

    public void searchQuery(String text) {
        driver.findElement(search).sendKeys(text +Keys.ENTER);
    }


}
