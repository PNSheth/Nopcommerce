package GenericLibrary;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POM.LoginPage;

public class BaseTest {
	
public WebDriver driver;
    @BeforeClass
	public void LaunchtheBrowser()
	{
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	   driver.manage().window().maximize();
	   driver.get("https://demowebshop.tricentis.com/");
	}
	@BeforeMethod
	public void Login()
	{
	  driver.findElement(By.partialLinkText("Log in")).click();
	  LoginPage lp=new LoginPage(driver);
	  //added un
	lp.getEmailTextfield().sendKeys("un");
	  
	//  driver.findElement(By.id("Email")).sendKeys("poojansheth@yahoo.com");
	//  driver.findElement(By.id("Password")).sendKeys("Pooja123@");
	//  driver.findElement(By.xpath("//input[@value='Log in']")).click();
	  
	}
	@AfterMethod
	public void Logout()
	{
		driver.findElement(By.partialLinkText("Log out")).click();
	}
	@AfterClass
	public void CloseBrowser()
	{
		driver.close();
	}
}
