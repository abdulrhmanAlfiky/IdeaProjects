package searchAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleHome;
import pages.SearchPage;
import base.TestBase;

public class NewTestSearch extends TestBase {

    // Test the verification of Logo
    @Test
    public void verifyLogo() {
        GoogleHome home = new GoogleHome(driver);
        Assert.assertTrue(home.isLogoDisplayed());
    }

    // Test the verification of Title

    @Test
    public void verifysTitle() {
        GoogleHome home = new GoogleHome(driver);
        Assert.assertEquals(home.title(), "Google");
    }

    // Test search functionality

    @Test
    public void verifytSearchResult() {
        SearchPage search = new SearchPage(driver);
        GoogleHome home = new GoogleHome(driver);
        home.searchQuery("Selenium webDriver");
        Assert.assertNotEquals(search.searchText(), "");

    }

    // Verifying cancel sign visibility
    @Test
    public void verifySearchBarVisibility() {
        SearchPage search = new SearchPage(driver);
        GoogleHome home = new GoogleHome(driver);
        home.searchQuery("cucumber io");
        Assert.assertTrue(search.cancelSignVisibility());
    }


}
