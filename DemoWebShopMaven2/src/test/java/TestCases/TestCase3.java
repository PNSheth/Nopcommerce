package TestCases;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import GenericLibrary.BaseTest;

public class TestCase3 extends BaseTest{
     @Test
	public  void AddToCartBookModule() throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.findElement(By.partialLinkText("Books")).click();
		WebElement SortBy=driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select sortby=new Select(SortBy);
		sortby.selectByIndex(4);
		Thread.sleep(4000);
		WebElement ItemSortBy=driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select Displaysortby=new Select(ItemSortBy);
		Displaysortby.selectByIndex(0);
		WebElement AddtoCart=driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"));
		AddtoCart.click();
		//driver.findElement(By.xpath("The product has been added to your ")).click();
		Thread.sleep(3000);
	    WebElement ShoppingCart=driver.findElement(By.linkText("Shopping cart"));
	    ShoppingCart.click();    
	    Thread.sleep(3000);
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView[true];",ShoppingCart);
	
	}

}
