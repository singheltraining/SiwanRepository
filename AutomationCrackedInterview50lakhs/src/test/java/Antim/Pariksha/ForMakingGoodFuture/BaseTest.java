package Antim.Pariksha.ForMakingGoodFuture;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	public static WebDriver driver;
	public static String projectPath=System.getProperty("user.dir")+"//src//test//resources//";
	public static FileInputStream fis;
	public static Properties mainProp;
	public static Properties childProp;
	public static Properties orProp;
	public static Properties p;
	public static ExtentReports rep;
	public static ExtentTest test;
	
	public static void init() throws Exception
	{
		fis = new FileInputStream(projectPath+"environment.properties");
		mainProp=new Properties();
		mainProp.load(fis);
		String e=mainProp.getProperty("env");
	//	System.out.println(e);
		
		fis = new FileInputStream(projectPath+e+".properties");
		childProp=new Properties();
		childProp.load(fis);
	//	String url=childProp.getProperty("amazonurl");
	//	System.out.println(url);
		
		 fis = new FileInputStream(projectPath+"data.properties");
		 p = new Properties();
		p.load(fis);
		
		fis = new FileInputStream(projectPath+"or.properties");
		orProp = new Properties();
		orProp.load(fis);
		
		//String browser = p.getProperty("firefoxbrowser");
		//	System.out.println(browser);	
		
		fis=new FileInputStream(projectPath+"log4jconfig.properties");
		PropertyConfigurator.configure(fis);

		rep=ExtentManager.getInstance();
	}
	
	public static void launch(String Browser)
	{
		if(p.getProperty(Browser).equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions option = new ChromeOptions();
	//		option.addArguments("--remote-allow-origins=*");
			option.addArguments("user-data-dir=C:\\Users\\Computer\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 6");
			option.addArguments("--start-maximize");
			option.addArguments("--disable-notifications");
			option.addArguments("--ignore-certificate-errors-spki-list");
	//		option.addArguments("--proxy-server=https://192.168.43.122:9292"); IP address and port number given by the client(if client is in USA)
			option.addArguments("--disable-popup-blocking");
	//		option.addArguments("--incognito");
			
			driver = new ChromeDriver(option);
		}
		else if(p.getProperty(Browser).equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}
	
	public static void navigateUrl(String url)
	{
		driver.get(childProp.getProperty(url));
	}
	
	
	public static void clickOption(String locatorkey)
	{
	//	driver.findElement(By.id(locator)).click();	
		getElement(locatorkey).click();
	}

	public static void typeText(String locatorkey, String text) 
	{
	//driver.findElement(By.id(locator)).sendKeys(text);	
		getElement(locatorkey).sendKeys(text);
	}
	
	public static void selectOption(String locatorkey, String option)
	{	
		//driver.findElement(By.id(locator)).sendKeys(option);
		getElement(locatorkey).sendKeys(option);
	}
	
	public static WebElement  getElement(String locatorkey) {
		
		WebElement element = null;
		
		if(!isElementPresent(locatorkey))
			System.out.println("Element is not present :"+locatorkey);
		
		element =driver.findElement(getLocator(locatorkey));
		return element;
	}

	public static boolean isElementPresent(String locatorkey) 
	{
		System.out.println("Checking for Element Present	:"+locatorkey);
		
		WebDriverWait	wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		
		try
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorkey)));
		}catch(Exception e)
		{
			return false;
		}
		return true;
		
	}
	public static By getLocator(String locatorkey)
	{
		By by = null;
		
		if(locatorkey.endsWith("_id")) 
		{
			by = By.id(orProp.getProperty(locatorkey));
		}
		else if(locatorkey.endsWith("_name")) 
		{
			by = By.name(orProp.getProperty(locatorkey));
		}
		else if(locatorkey.endsWith("_className")) 
		{
			by = By.className(orProp.getProperty(locatorkey));
		}
		else if(locatorkey.endsWith("_xpath")) 
		{
			by = By.xpath(orProp.getProperty(locatorkey));
		}
		else if(locatorkey.endsWith("_css")) 
		{
			by = By.cssSelector(orProp.getProperty(locatorkey));
		}
		else if(locatorkey.endsWith("_linktext")) 
		{
			by = By.linkText(orProp.getProperty(locatorkey));
		}
		else if(locatorkey.endsWith("_partiallinktext")) 
		{
			by = By.partialLinkText(orProp.getProperty(locatorkey));
		}

		return by;
	}
	
}

