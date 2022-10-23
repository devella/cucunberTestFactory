package loginHome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
    @FindBy(id = "logout")
    WebElement btn_logout;

    WebDriver driver;

    public logout (WebDriver driver) {
        this.driver = driver;
        //initialize Elements using method initElement
        PageFactory.initElements(driver,this);
        // this is login class
    }


    public void logoutIsDisplayed() {
        btn_logout.isDisplayed();
    }
}


