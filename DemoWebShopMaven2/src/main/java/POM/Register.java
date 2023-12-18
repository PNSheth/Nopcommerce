package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Register {
	WebElement RadioButton;
	WebElement GenderMaleRadioButton;
	WebElement FirstNameTextField;
	WebElement LastNameTextField;
	WebElement EmailTextField;
	WebElement PasswordTextField;
	WebElement ConfirmPasswordTextField;
	WebElement RegisterButton;
	
	public Register(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void setRadioButton(WebElement radioButton) {
		RadioButton = radioButton;
	}
	public void setFirstNameTextField(WebElement firstNameTextField) {
		FirstNameTextField = firstNameTextField;
	}
	public void setLastNameTextField(WebElement lastNameTextField) {
		LastNameTextField = lastNameTextField;
	}
	public void setEmailTextField(WebElement emailTextField) {
		EmailTextField = emailTextField;
	}
	public void setPasswordTextField(WebElement passwordTextField) {
		PasswordTextField = passwordTextField;
	}
	public void setConfirmPasswordTextField(WebElement confirmPasswordTextField) {
		ConfirmPasswordTextField = confirmPasswordTextField;
	}
	public void setRegisterButton(WebElement registerButton) {
		RegisterButton = registerButton;
	}
	
}
