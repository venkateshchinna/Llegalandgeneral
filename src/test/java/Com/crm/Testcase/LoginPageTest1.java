package Com.crm.Testcase;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Com.crm.Base.TestBase;
import Com.crm.pages.HomePage;
import Com.crm.pages.LoginPage;

public class LoginPageTest1 extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest1()  {
		super();
	}
	@BeforeTest
	public void setUp()
	{
		initialization();
		 loginpage=new LoginPage();
	}
	
	@Test(priority=1)
	public void loginpageTitle()
	{
		String Title=loginpage.validatalogin();
		Assert.assertEquals(Title,"CRMPRO ");
	}
	@Test(priority=2)
	public void  loignTest()
	{
		
		homepage=loginpage.login1(pro.getProperty("username"),pro.getProperty("password"));
	}

	
}
