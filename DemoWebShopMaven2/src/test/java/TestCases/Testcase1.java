package TestCases;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericLibrary.BaseTest;

public class Testcase1 extends BaseTest {
    @Test
	public void testCase1() throws InterruptedException{
		// TODO Auto-generated method stub
   //  driver.findElement(By.partialLinkText("Log out")).click();
      WebElement Register=driver.findElement(By.linkText("Register"));
      Register.click();
      Thread.sleep(2000);
      WebElement femaleRadioButton=driver.findElement(By.id("gender-female"));
      femaleRadioButton.click();
      WebElement Fname=driver.findElement(By.id("FirstName"));
      JavascriptExecutor js=(JavascriptExecutor) driver;
      js.executeScript("arguments[0].value='Poojan';",Fname);;
      WebElement Lname=driver.findElement(By.id("LastName"));
      js.executeScript("arguments[0].value='Sheth';",Lname );
      WebElement Email= driver.findElement(By.id("Email"));
      Email.sendKeys("pnsh@yahoo.com");
      driver.findElement(By.id("Password")).sendKeys("Pooja12@");
      driver.findElement(By.id("ConfirmPassword")).sendKeys("Pooja12@");
      driver.findElement(By.id("register-button")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@value='Continue']")).click();
      
     
      
      }

}
