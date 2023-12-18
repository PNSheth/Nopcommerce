package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

@FindBy(id="Email")
private WebElement emailTextfield;
@FindBy(id="Password")
private	WebElement passwordTextfield;
@FindBy(xpath="//input[@value='Log in']")
private	WebElement LoginButton;

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
//To create getters method click on source and then generate getters and setters
public WebElement getEmailTextfield() {
	return emailTextfield;
}
public WebElement getPasswordTextfield() {
	return passwordTextfield;
}
public WebElement getLoginButton() {
	return LoginButton;
}


}
