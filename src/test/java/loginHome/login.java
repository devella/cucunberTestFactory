package loginHome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
 @FindBy(id = "name")
 WebElement txt_username;

 @FindBy(id = "password")
 WebElement txt_password;


 @FindBy(id = "login")
 WebElement btn_login;

 WebDriver driver;

 public login (WebDriver driver) {
    this.driver = driver;
    //initialize Elements using method initElement
     PageFactory.initElements(driver,this);
     // this is login class
 }


 public void enterUsername(String username) {
    txt_username.sendKeys(username);
 }

 public void enterPassword(String password) {
     txt_password.sendKeys(password);
 }

 public void clickTheLogin() {
     btn_login.click();
 }

}
