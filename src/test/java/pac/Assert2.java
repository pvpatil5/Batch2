package pac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Assert2
{
	@Test
	public void title() 
	{
		System.setProperty("webdriver.chrome.driver", "../Selenium2/DriverExe/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement searchbox =driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
		driver.navigate().refresh();
		searchbox.sendKeys("Selenium");
		
		
		
//		// Hard Assert
//		Assert.assertEquals(title, exp, "Title is NOT Matching");
//
//		Assert.assertTrue(searchbox.isDisplayed()); // TC will pass
//		
//		searchbox.sendKeys("Selenium");
//
//		SoftAssert sf = new SoftAssert();
//		
//		sf.assertEquals(title, exp);
//		
//		
//		driver.close();
//		sf.assertAll();

	}


}
