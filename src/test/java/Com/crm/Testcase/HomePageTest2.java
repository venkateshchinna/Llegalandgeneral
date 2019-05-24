package Com.crm.Testcase;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.crm.Base.TestBase;
import Com.crm.Utils.TestUtils;
import Com.crm.pages.ContactPage;
import Com.crm.pages.HomePage;
import Com.crm.pages.LoginPage;

public class HomePageTest2 extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	TestUtils testutil;
	ContactPage contactpage;
	public HomePageTest2()
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
		
	}
	
	@Test(priority=1)
	public void verifyHomepageTest()
	{
		String homepagetitle=homepage.verifyHomepage();
		Assert.assertEquals(homepagetitle,"CRMPRO","homepage title noe mathched" );
	}
	
	@Test(priority=2)
	public void verifycorrectuserTest()
	{
		testutil.switchToframe();
		 Assert.assertTrue(homepage.verifyCorrectusername());
	}
	
	
	@Test(priority=3)
	public void verifyContactslink()
	{
		testutil.switchToframe();
		contactpage=homepage.clickOnContacts();
	}
	@Test(priority=4)
		public void VerifyNewContactTest() {
			
		homepage.clickOnNewcontact();
	}
	
	

}
