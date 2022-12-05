package Scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import PomPages.SkillraryDemoLoginPage;
import PomPages.SkillraryLoginPage;
import PomPages.TestingPage;
import genericlibrary.BaseClass;

public class Testcase2 extends BaseClass {
	
	@Test
	public void tc2() throws IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		SkillraryDemoLoginPage s1=new SkillraryDemoLoginPage(driver);
		driverutilies.switchingtabs(driver);
		driverutilies.dropDown(s1.getDropdow(),pdata.getproprtydata("coursedd"));
		
		TestingPage t=new TestingPage(driver);
		driverutilies.dragdrop(driver,t.getSelcourse(),t.getCarttab());
		Point loc = t.getFacebook().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		driverutilies.scrollBar(driver, x, y);
		t.facebookicon();
	}

}
