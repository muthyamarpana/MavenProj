package testScenarios;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Rediff {
	WebDriver driver;
	//ArrayList<String> test;
	@Test(priority=1)
	public void openRediff()
	{
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();	
		driver.findElement(By.linkText("Sign in")).click();
	}
	@Test(description="Hard Assert",priority=2,enabled=false)
	public void loginRediff1()
	{
		String title=driver.getTitle();
		System.out.println("Title="+title);
		Assert.assertEquals(title, "rediffmail - Free Email for Login with Secure Access");
		System.out.println("Assert Executed...");
	}
	@Test(description="Soft Assert",priority=2)
	public void loginRediff()
	{
		SoftAssert assertion = new SoftAssert();
		String title=driver.getTitle();
		System.out.println("Title="+title);
		assertion.assertEquals(title, "Rediffmail - Free Email for Login with Secure Access");
		System.out.println("Assert Executed...");
		assertion.assertAll();
	}
	@Test(priority=3)
	public void closeRediff()
	{
		driver.quit();
	}

}
