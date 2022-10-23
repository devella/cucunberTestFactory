package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import loginHome.login;
import loginHome.logout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class loginStep_PF {

    WebDriver driver = null;
    // create object for login page
    //loginPom loginObj = loginPom(driver)
    //declare at the globe level
   login loginObj;
   logout logoutObj;

    @Given("the browser is open")
    public void the_browser_is_open() {
        //String projectPath = System.getProperty("user.dir");


        System.out.println("===inside login Step===");
        System.out.println("Starting-browser is open");
        System.setProperty("webdriver.gecko.driver", "/Users/samson/IdeaProjects/cucunberTestFactory/Drivers/geckodriver");
        //System.setProperty("webdriver.chrome.driver", projectPath+"/Cucumber_New/Drivers/chromedriver 2");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        //driver.manage().window().maximize();
        System.out.println("Ending-browser is open");
    }

    @And("user is on login page")
    public void user_is_on_login_page() {

        driver.navigate().to("https://example.testproject.io/web/");
    }

    @When("^user enters valid (.*) and (.*)$")
    public void user_enters_valid_username_and_password(String username, String password) throws InterruptedException {
        loginObj = new login(driver);
        loginObj.enterUsername(username);
        loginObj.enterPassword(password);
        Thread.sleep(2000);

    }


    @And("user clicks on login")
    public void user_clicks_on_login() {
        loginObj.clickTheLogin();

    }

    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() throws InterruptedException {logoutObj = new logout(driver);
        logoutObj.logoutIsDisplayed();
        Thread.sleep(2000);
        driver.close();
        driver.quit();

    }




}
