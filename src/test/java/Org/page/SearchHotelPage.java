package Org.page;


	import Org.Global.SeleniumBase;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class SearchHotelPage extends SeleniumBase {

		public SearchHotelPage() {

			PageFactory.initElements(driver, this);

		}
		
		@FindBy(xpath="//input[@id='location']")
		private WebElement location;

		public WebElement getLocation() {
			return location;
		}
	}

