package Com.crm.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.crm.Base.TestBase;


public class LoginPage extends TestBase{

	
	//pagefactory element 
	@FindBy(name="username")
	WebElement Username;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(xpath="//input[@type='submit' and @value='Login']")
	WebElement loginbtn;
	
	//findby(xpath="//button[contains(text(),'Sign Up')]")
	@FindBy(xpath="//a[.='Sign Up']")
	WebElement signupBut;
	
	@FindBy(className="img-responsive")
	WebElement Logocrm;
	
	public String validatalogin() {
		return driver.getTitle();
	}
	public boolean validatacrmlogo()
	{
		return Logocrm.isDisplayed();
	}
	
	// initialization elements
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public  HomePage login1(String User,String Pass)
	{
		Username.sendKeys(User);
		Password.sendKeys(Pass);
		loginbtn.click();	
		
		return new HomePage();
	}
	
	
}
