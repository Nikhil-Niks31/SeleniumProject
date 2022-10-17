package scripts;

import java.io.IOException;


import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WishlistPage;

public class Testcase3 extends BaseClass {
	@Test
	public void tc3() throws IOException, InterruptedException {
		
		SkillraryLoginPage s1=new SkillraryLoginPage(driver);
		s1.searchtextbox(pdata.getData("search"));
	
		s1.searchButton();
		
		CoreJavaPage cp=new CoreJavaPage(driver);
		cp.corejavacourse();
		
		WishlistPage w=new WishlistPage(driver);
		w.closepoppup();
		driverutiles.switchFrame(driver);
		
		Thread.sleep(2000);
		w.playbutton();
		Thread.sleep(5000);
		w.pausebutton();
		
		driverutiles.switchBack(driver);
		w.wishlist();
		
	}

}
