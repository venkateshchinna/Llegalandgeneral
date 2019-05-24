package Com.crm.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Com.crm.Utils.TestUtils;
import Com.crm.Utils.WebEventListener;

public class TestBase {

    public static WebDriver driver=null;
	public static Properties pro;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventlistener;
	
	public TestBase() 
  	{
		
		try {
			 pro=new Properties();
			FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Com\\crm\\config\\Config.Properties");
			
			pro.load(ip);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		
		}
		
		
	}
	
	public void initialization()
	{
 		String browsername=pro.getProperty("browser");
		if(browsername.equals("chrome")) { 
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		
		e_driver=new EventFiringWebDriver(driver);
// Now create object of EventlisterHandle to register it with EventFiringWebDriver	
		eventlistener=new 	WebEventListener();
		e_driver.register(eventlistener);
		driver=e_driver;
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get(pro.getProperty("url"));
	} 
	
		
}
