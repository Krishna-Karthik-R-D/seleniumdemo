package listner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(listner.ListnerTest.class)
public class Demo_listner extends BaseClass  {
	
	public static WebDriver driver ;
	@Test
	public void screenShot()
	{
    
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		String tit = driver.getTitle();
		System.out.println(tit);
		Assert.assertEquals("SkillRary-ECommerce", tit);
		driver.close();
		
	}

}
