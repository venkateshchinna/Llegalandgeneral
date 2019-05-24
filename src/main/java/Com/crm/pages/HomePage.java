package Com.crm.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.crm.Base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//td[@classtd='headertext']")
	@CacheLookup
	WebElement usernamelink;
	

	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactslink;
	
	@FindBy(xpath="//a[contains(text(),'New Contact')]")
	WebElement newContactslink;
	
	@FindBy(xpath="//a[.='Deals']")
	WebElement dealslink;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomepage()
	{
		return driver.getTitle();
		
	}
	
	public boolean verifyCorrectusername(){
		return usernamelink.isDisplayed();
	}
	public ContactPage clickOnContacts()
	{
		contactslink.click();
		return new ContactPage();
	}
	
	public DealsPage  clickOnDeals()
	{
		dealslink.click();
		return new DealsPage();
	}
	
	public void clickOnNewcontact(){
		Actions action=new Actions(driver);
		action.moveToElement(contactslink).build().perform();
		newContactslink.click();
		
		
	}
	
	
	
	
}
