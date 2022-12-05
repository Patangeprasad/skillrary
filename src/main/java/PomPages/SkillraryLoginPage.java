package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gerasbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemopage;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement gobtn;
	
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void gearsbutton() {
		gerasbtn.click();
	}
	
	public void skillrarydemoapplication() {
		skillrarydemopage.click();
	}
	
	public void searchtb(String name) {
		searchtb.sendKeys(name);
	}
	
	public void searchbutton() {
		gobtn.click();
	}

}
