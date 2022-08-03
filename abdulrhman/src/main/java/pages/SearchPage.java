package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    WebDriver driver;
    By resultStats = By.id("result-stats");
    By cancelSign = By.xpath("//span[@jsname='itVqKe']");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public String searchText() {
        return driver.findElement(resultStats).getText();
    }
    public boolean cancelSignVisibility() {
        return driver.findElement(cancelSign).isDisplayed();
    }
}
