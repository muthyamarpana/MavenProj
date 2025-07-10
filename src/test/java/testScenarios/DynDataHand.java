package testScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynDataHand {

	
	@Test
	public void dynData()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Simple-Math-Captcha-Plugin-for-jQuery-ebcaptcha/demo/");
		driver.manage().window().maximize();	
		for(int i=1;i<=3;i++)
		{
		String str=driver.findElement(By.id("ebcaptchatext")).getText();
		System.out.println(str);
		String str1=str.substring(8, 9);
		String str2=str.substring(12);
		System.out.println(str1+"\t"+str2);
		int sum =Integer.valueOf(str1)+Integer.valueOf(str2);
		driver.findElement(By.id("ebcaptchainput")).sendKeys(String.valueOf(sum));
		boolean chkEnbl=driver.findElement(By.xpath("//*[@id=\"form\"]/input[2]")).isEnabled();
		if(chkEnbl==true)
		{
			System.out.println("Calculation is correct..");
			
		}
		else
		{
			System.out.println("Calculation is incorrect...");
		}
		driver.navigate().refresh();
		}
		driver.quit();
	}
}
