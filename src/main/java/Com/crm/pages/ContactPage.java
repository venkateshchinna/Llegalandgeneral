package Com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.crm.Base.TestBase;

public class ContactPage  extends TestBase{

	
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement contactlabel;
	
	@FindBy(id="first_name")
	WebElement firstname;
	
	@FindBy(id="surname")
	WebElement Lastname;
	
	@FindBy(name="client_lookup")
	WebElement Company;
	
	@FindBy(xpath="//input[@type='submit' AND @value='Save']")
	WebElement savebtn;
	
	  
	
	public ContactPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifyContactslabel()
	{
		return contactlabel.isDisplayed();
	}
	
	public void selectContactsByName(String name){
	
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
	}	
		
	public void CreatenewContact(String title,String ftname,String ltname,String comp )
		{
			Select select=new Select(driver.findElement(By.name("title")));
			select.selectByVisibleText(title);
			
		firstname.sendKeys(ftname);
		Lastname.sendKeys(ltname);
		Company.sendKeys(comp);
		savebtn.click();
		
		
	}
}
