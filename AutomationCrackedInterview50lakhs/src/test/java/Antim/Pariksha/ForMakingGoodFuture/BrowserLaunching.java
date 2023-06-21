package Antim.Pariksha.ForMakingGoodFuture;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunching 
{
	public static void main(String[] args) throws Exception
	{
			WebDriver driver;
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.amazon.in");
			
			Thread.sleep(2000);
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.bestbuy.com");
			
			Thread.sleep(2000);   
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get("https://www.amazon.in");   
			
			Thread.sleep(2000);    
			
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.get("https://www.redbus.in/");
					
	}

}
