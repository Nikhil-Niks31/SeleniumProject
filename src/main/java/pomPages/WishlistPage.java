package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playbtn;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addtowishlist;
	
	@FindBy(xpath="//a[text()='X']")
	private WebElement closepp;
	
	
	public WishlistPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
		public void playbutton() {
			playbtn.click();
			
		}
		
		public void pausebutton() {
			pausebtn.click();
		}
		
		public void wishlist() {
			addtowishlist.click();
		}
		public void closepoppup() {
			closepp.click();
		}
		
	

}
