package Grid;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LoginTestOnWindowsUsingChrome
{
	static WebDriver driver;
	
	@Test(priority=1)
	void setup() throws MalformedURLException
	{
		String nodeURL = "http://192.168.43.122:29568/wd/hub";
		
		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setCapability("browserName", "chrome");
		dc.setPlatform(Platform.WIN10);
				
		System.setProperty("webdriver.chrome.driver", "V:\\maven2023\\chromedriver.exe");
		driver = new RemoteWebDriver(new URL(nodeURL),dc);
	}
	
	@Test(priority=2)
	void login()
	{
		driver.get("https://practice.automationtesting.in/my-account/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("mrityunjaysinghel");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test1234");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		String captureTxt=driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/ul/li/strong[2]")).getText();
		
		if(captureTxt.contains("mrityunjaysinghel"))
		{
			System.out.println("Test Passsed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		driver.quit();
	}
	
}
