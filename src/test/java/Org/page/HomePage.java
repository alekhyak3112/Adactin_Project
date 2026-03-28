package Org.page;
	
import Org.Global.SeleniumBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v138.network.model.PrivateNetworkRequestPolicy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class HomePage extends SeleniumBase {

		public HomePage() {
			
			PageFactory.initElements(driver, this);
		}
		
		//WebElement user = driver.findElement(By.id("username"));
		
		@FindBy(xpath="//input[@id='username']")
		private WebElement username; 

		public WebElement getUsername() {
			return username;
		}
		
		@FindBy(xpath="//input[@id='password']")
		private WebElement password;
		
		
		public WebElement getPassword() {
			return password;
		}
		
		
		

		//	WebElement user = driver.findElement(By.id("username"));
		
		// Annotations - @FindBy
		
		// PageFactory - PreDefined Class
		    // initElements() - static method
		          // Used to Initialize the WebElement Each and every whenever it get invoked
		
		

		
	}

