package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import PomPages.AddtowishlistPage;
import PomPages.CorejavaPage;
import PomPages.SkillraryLoginPage;
import genericlibrary.BaseClass;

public class Testcase3 extends BaseClass {
	
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.searchtb(pdata.getproprtydata("coursename"));
		s.searchbutton();
		
		CorejavaPage c=new CorejavaPage(driver);
		c.corejavacourse();
		
		AddtowishlistPage a=new AddtowishlistPage(driver);
		a.intobutton();
		driverutilies.switchFrame(driver);
		a.playbutton();
		Thread.sleep(10000);
		a.pausebutton();
		driverutilies.switchbackframe(driver);
		a.addtowistlis();
		
		
	}

}
