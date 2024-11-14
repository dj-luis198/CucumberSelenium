package actions;

import locators.HomePageLocators;
import org.openqa.selenium.support.PageFactory;

public class HomePageActions {
    HomePageLocators homePageLocators;

    public HomePageActions() {

        this.homePageLocators = new HomePageLocators();

        PageFactory.initElements(HelperClass.getDriver(),homePageLocators);
    }

    // Get the User name from Home Page
    public String getHomePageText() {
        return homePageLocators.homePageUserName.getText();
    }
}
