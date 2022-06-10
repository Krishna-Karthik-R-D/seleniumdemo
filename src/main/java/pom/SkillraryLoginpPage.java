package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BaseClass;
/**
 * 
 * @author Arshiya Khannum
 *
 */
public class SkillraryLoginpPage {
	/**
	 * 
	 * skillrarry login page
	 * pom
	 * Declaration
	 * 
	 */
	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(name="login")
	private WebElement loginButton;
	/**
	 * 
	 * skillrarry login page
	 * pom
	 * initialization
	 * 
	 */
	public SkillraryLoginpPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	/**
	 * 
	 * skillrarry login page
	 * pom
	 * utilization
	 * 
	 */
	public void un(String user) {
		username.sendKeys(user); 
		
	}

	public void password(String pass) {
		password.sendKeys(pass);
	}
	public void ln() {
		loginButton.click();
	}
}
