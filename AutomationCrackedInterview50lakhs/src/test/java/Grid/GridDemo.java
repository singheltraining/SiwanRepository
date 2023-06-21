package Grid;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GridDemo 
{
	WebDriver driver=null;
	//WebDriver driver;
  @Test(priority=1)
  public void test1() throws Exception 
  {
	  System.out.println("Starting test1");
     WebDriverManager.firefoxdriver().setup();
	//  System.setProperty("webdriver.chrome.driver", "V:\\maven2023\\chromedriver.exe");
	  
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("firefox");
	 driver = new RemoteWebDriver(new URL( "http://192.168.43.122:29568/wd/hub"), ds);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	System.out.println(driver.getTitle());
	
	driver.quit();
	
	System.out.println("Ending test1");
  }
  
  
  @Test(priority=2)
  public void test2() throws Exception 
  {
	  System.out.println("Starting test2");
	  WebDriverManager.firefoxdriver().setup();
	//  System.setProperty("webdriver.chrome.driver", "V:\\maven2023\\chromedriver.exe");
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("firefox");
	  
	 driver = new RemoteWebDriver(new URL( "http://192.168.43.122:29568/wd/hub"), ds);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	System.out.println(driver.getTitle());
	
	driver.quit();
	
	System.out.println("Ending test2");
  }
  
  @Test(priority=3)
  public void test3() throws Exception 
  {
	  System.out.println("Starting test3");
	  WebDriverManager.firefoxdriver().setup();
	 // System.setProperty("webdriver.chrome.driver", "V:\\maven2023\\chromedriver.exe");
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("firefox");
	  
	 driver = new RemoteWebDriver(new URL("http://192.168.43.122:29568/wd/hub"), ds);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	System.out.println(driver.getTitle());
	
	driver.quit();
	
	System.out.println("Ending test3");
  }
  
  
  @Test(priority=4)
  public void test4() throws Exception 
  {
	  System.out.println("Starting test4");
	  WebDriverManager.firefoxdriver().setup();
	 // System.setProperty("webdriver.chrome.driver", "V:\\maven2023\\chromedriver.exe");
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("firefox");
	  
	 driver = new RemoteWebDriver(new URL( "http://192.168.43.122:29568/wd/hub"), ds);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	System.out.println(driver.getTitle());
	
	driver.quit();
	
	System.out.println("Ending test4");
  }
  
  @Test(priority=5)
  public void test5() throws Exception 
  {
	  System.out.println("Starting test5");
	WebDriverManager.firefoxdriver().setup();
	//  System.setProperty("webdriver.chrome.driver", "V:\\maven2023\\chromedriver.exe");
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("firefox");
	  
	 driver = new RemoteWebDriver(new URL( "http://192.168.43.122:29568/wd/hub"), ds);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	System.out.println(driver.getTitle());
	
	driver.quit();
	
	System.out.println("Ending test5");
  }
  
  @Test(priority=6)
  public void test6() throws Exception 
  {
	  System.out.println("Starting test6");
	 WebDriverManager.firefoxdriver().setup();
	//  System.setProperty("webdriver.chrome.driver", "V:\\maven2023\\chromedriver.exe");
	  DesiredCapabilities ds = new DesiredCapabilities();
	  ds.setPlatform(Platform.WINDOWS);
	  ds.setBrowserName("firefox");
	  
	 driver = new RemoteWebDriver(new URL( "http://192.168.43.122:29568/wd/hub"), ds);
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	System.out.println(driver.getTitle());
	
	driver.quit();
	
	System.out.println("Ending test6");
  }
}
