package genericlib;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	
	public static WebDriver driver;
	
	public void dropDown(WebElement ele ,String text) {
		Select s = new Select(ele);
		s.deselectByVisibleText(text);
		
		
	}
	public void mouseHovering(WebDriver driver,WebElement ele1) {
		 Actions a = new Actions(driver);
		 a.moveToElement(ele1).perform();
		
	}
	public void doubleClick(WebDriver driver,WebElement ele2) {
		 Actions a = new Actions(driver);
		a.doubleClick(ele2).perform();
		
	}
	public void switchToFrame(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	
	public void switchBackFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	public void alertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void switchTabs(WebDriver driver) {
		Set<String> window = driver.getWindowHandles();
		for (String wb : window) {
			driver.switchTo().window(wb);
		}
	}


}
