package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coursepage {
	@FindBy(id="Selenium Training")
	private WebElement selenium;
	
	@FindBy(id="cartArea")
	private WebElement cartarea;
	
	@FindBy(xpath="(//i[@class='fa fa-linkedin'])[2]")
	private WebElement linkedin;
	
	public Coursepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSeleium() {
		return selenium;
	}

	public WebElement getCartarea() {
		return cartarea;
	}

	public WebElement getLinkedin() {
		return linkedin;
	}
	public void linkedinIcon() {
		linkedin.click();
	}
	
	

}
