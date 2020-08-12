package pac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample1
{

	@Test
	public void getTitle()
	{
		System.setProperty("webdriver.chrome.driver", "../Selenium2/DriverExe/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}
	
	
}
