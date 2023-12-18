package GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.io.FileHandler;

public class UtilityMethods {


	public String getDataFrompropeties(String key) throws IOException
{
	  FileInputStream fls=new FileInputStream("./src/test/resources/TestData/TestData.properties");
	  Properties p=new Properties();
	  p.load(fls); 
	  String value=p.getProperty(key);
	  return value;
	 
}
	 public  String getDataFromExcel(String s, int r, int c) throws EncryptedDocumentException, IOException
	 {  FileInputStream fs=new FileInputStream("./src/test/resources/TestData/testdatasheet1.xlsx");
		Workbook book=WorkbookFactory.create(fs);
		Sheet s1=book.getSheet(s);	
		String value=s1.getRow(r).getCell(c).toString();
		 return value;
	 }
	 
	 public void waitUntilVisibilityOfElement(WebDriver driver,WebElement element)
	 {
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.invisibilityOf(element));
		 
	 }

	 public void takeAScreenShot(WebDriver driver,String name)
	 {
		 TakesScreenshot ts=(TakesScreenshot) driver;
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 File trg=new File("./Screenshot/"+name+"png");
		 try
		 {
			 FileHandler.copy(src, trg);
		 }
		catch(IOException io)
		 {
			io.printStackTrace();
		 }
			
			
	 }
}
