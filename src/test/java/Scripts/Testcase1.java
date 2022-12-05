package Scripts;

import org.testng.annotations.Test;

import PomPages.AddtocartPage;
import PomPages.SkillraryDemoLoginPage;
import PomPages.SkillraryLoginPage;
import genericlibrary.BaseClass;

public class Testcase1 extends BaseClass {
	
	@Test
	public void tc1() {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		
		SkillraryDemoLoginPage s1=new SkillraryDemoLoginPage(driver);
		driverutilies.switchingtabs(driver);
		driverutilies.mouseHover(driver,s1.getCoursebtn());
		s1.seleniumtrainingtab();
		
		AddtocartPage s2=new AddtocartPage(driver);
		driverutilies.doubleClick(driver,s2.getAddbtn());
		s2.addtocartbtn();
		driverutilies.alertpopup(driver);
		
	}
	

}
