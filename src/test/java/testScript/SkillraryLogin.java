package testScript;


import org.testng.annotations.Test;
import genericlib.BaseClass;
import listner.Demo_listner;
import pom.Logo;
import pom.SkillraryLoginpPage;
/**
 * 
 * @author Arshia Khannum
 *
 */
public class SkillraryLogin extends BaseClass {

	@Test
	public void tc(){
       
		SkillraryLoginpPage s= new SkillraryLoginpPage(driver);
		s.un("admin");
		s.password("admin");
		s.ln();
		
		Logo l = new Logo(driver);
		utility.mouseHovering(driver, l.getLogos());
		//l.getLogos();
		
		Demo_listner d = new Demo_listner();
		d.screenShot();
		
		
	}

}
