package Com.crm.Utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import Com.crm.Base.TestBase;

public  class WebEventListener extends TestBase implements WebDriverEventListener {

	public void beforeNavigateTo(String url,WebDriver driver)
	{
		System.out.println("Before navigate to:'"+url+"'");
	}
	public void afterNavigateTo(String url,WebDriver driver)
	{
		System.out.println("navigated to:'"+url+"'");
	}
	public void beforeChangeValueOf(WebElement element,WebDriver driver)
	{
		System.out.println("Value of the:"+element.toString()+"before any change made");
	}
	
	public void afterChangeValueOf(WebElement element,WebDriver driver)
	{
		System.out.println("Element value change to:"+element.toString());
	}
	public void beforeClickOn(WebElement element,WebDriver driver)
	{
		System.out.println("Trying to click on:"+element.toString());
	}
	public void afterClickOn(WebElement element,WebDriver driver)
	{
		System.out.println("Clicked On:"+element.toString());
	}
	public void beforeNavigatBack(WebDriver driver)
	{
		System.out.println("Navigating back to previous page");
	}
	public void afterNavigateBack(WebDriver driver)
	{
		System.out.println("Navigated back to previous page");
	}
	public void beforeNavigateforward(WebDriver driver)
	{
		System.out.println("Naviagting forward to next page");
	}
	public void afterNavigateForward(WebDriver driver)
	{
		System.out.println("Navigated forward to nxt page");
	}
	public void onException(Throwable error,WebDriver driver)
	{
		System.out.println("Exception occured:"+error);
		try{
			TestUtils.takeScreenShotAtEndOfTest();
		 }catch(IOException e)
		{
			 e.printStackTrace();
		}
	}
	public void beforeFindBy(By by,WebElement element,WebDriver driver)
	{
		System.out.println("Trying to find elemenet By:"+by.toString());
	}
	public void afterFindBy(By by,WebElement element,WebDriver driver)
	{
		System.out.println("Found element By:"+by.toString());
	}
	
	public void beforeScript(String script,WebDriver driver)
	{
		
	}
	public void afterScript(String script,WebDriver driver)
	{
		
	}
	public void beforeAlertAccept(WebDriver driver)
	{
		
	}
	public void afterAlertAccept(WebDriver driver)
	{
		
	}
	public void beforeAlertDismiss(WebDriver driver)
	{
		
	}
	public void afterAlertDismiss(WebDriver driver)
	{
		
	}
	public void beforeNavigateRefresh(WebDriver driver)
	{
		
	}
	public void afterNavigateRefresh(WebDriver driver)
	{
		
	}
	public void beforeChangeValueOf(WebElement element,WebDriver driver,CharSequence[] keysTosend)
	{
		
	}
	public void afterChangeValueOf(WebElement element,WebDriver driver,CharSequence[] keysTosend)
	{
		
	}
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}
}
	
	
//	public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void afterClickOn(WebElement arg0, WebDriver arg1) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void afterNavigateBack(WebDriver arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void afterNavigateForward(WebDriver arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void afterNavigateRefresh(WebDriver arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void afterNavigateTo(String arg0, WebDriver arg1) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void afterScript(String arg0, WebDriver arg1) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void beforeNavigateBack(WebDriver arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void beforeNavigateForward(WebDriver arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void beforeNavigateRefresh(WebDriver arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void beforeNavigateTo(String arg0, WebDriver arg1) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void beforeScript(String arg0, WebDriver arg1) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void onException(Throwable arg0, WebDriver arg1) {
//		// TODO Auto-generated method stub
//		
//	}
//}
	
	
	

