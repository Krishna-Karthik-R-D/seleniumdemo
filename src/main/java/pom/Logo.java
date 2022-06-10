package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logo {
	@FindBy(xpath="//b[text()='SkillRary']")
	public WebElement logos;
	
	public Logo(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	public WebElement getLogos() {
		return logos;
	}
	
	
}
