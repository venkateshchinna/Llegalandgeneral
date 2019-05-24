package Com.crm.Testcase;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.crm.Base.TestBase;
import Com.crm.Utils.TestUtils;
import Com.crm.pages.ContactPage;
import Com.crm.pages.HomePage;
import Com.crm.pages.LoginPage;

public class ContactPageTest3 extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	TestUtils testutil;
	ContactPage contactpage;
	
	String sheetName="Contact";
	
	public ContactPageTest3()
	{
		super();
	}
	
	@BeforeTest
	public void setUp(){
		initialization();
		testutil=new TestUtils();
		loginpage=new LoginPage();
		contactpage=new ContactPage();
		homepage=loginpage.login1(pro.getProperty("username"),pro.getProperty("password"));
		testutil.switchToframe();
		contactpage=homepage.clickOnContacts();
		
	
	}
	
   @Test(priority=1)
   public void verifyContactsPagelabel(){
	  Assert.assertTrue(contactpage.verifyContactslabel(),"Contact label is missing on the page");
}
	@Test(priority=2)
	public void selectSingalContactTest(){
	contactpage.selectContactsByName("test2  test2");
	}
	
	@Test(priority=3)
	public void selectMultipleContactTest()
	{
		contactpage.selectContactsByName("test2  test2");
		contactpage.selectContactsByName("ui uii");
	}
	
	@DataProvider
	public Object[][] getCRMTestData(){
	Object[][] data=TestUtils.getTestData(sheetName);	
	return data;
		
	}
	
	
	
	@Test(priority=4,dataProvider="getCRMTestData")
	public void validateCreatenewContact(String Title,String firstname,String lastName,String Company )
	{
		homepage.clickOnNewcontact();
		
		//contactpage.CreatenewContact("Mr.","Tom","peter","Google");
		contactpage.CreatenewContact(Title, firstname, lastName, Company);
	}
	
	
	
	
}
