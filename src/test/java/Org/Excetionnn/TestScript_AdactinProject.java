package Org.Excetionnn;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Org.Global.SeleniumBase;

	public class TestScript_AdactinProject extends SeleniumBase{

		public static void main(String[] args) throws InterruptedException {
			
			SeleniumBase seleniumBase = new SeleniumBase();
			
			System.out.println("Hello");
			
			getBrowser("Firefox");
			seleniumBase.getApplication("https://adactinhotelapp.com/index.php");
			seleniumBase.windMax();
			
			seleniumBase.screenCapture("Home");
				
			WebElement Loginpgetext = driver.findElement(By.xpath("//td[contains(text(),'Existing User Login')]"));	
			System.out.println(Loginpgetext.getText());
			
			seleniumBase.screenCapture2();
			
			WebElement user = driver.findElement(By.id("username"));
			seleniumBase.sendkeysByJava(user,"AlekhyaKA");
			
			WebElement password = driver.findElement(By.id("password"));
			seleniumBase.sendkeysByJava(password,"EUUK2Z");		
			
			WebElement login = driver.findElement(By.id("login"));
			seleniumBase.clickByJava(login);
			
			WebElement searchHotelText = driver.findElement(By.xpath("//td[@class=\"login_title\"]"));
			String text = searchHotelText.getText();
			System.out.println(text);
				
			seleniumBase.screenCapture("search hotel");
				
		    WebElement Location = driver.findElement(By.xpath("//option[@value=\"Melbourne\"]"));
			Location.click();
			
			WebElement Hotel = driver.findElement(By.xpath("//option[@value=\"Hotel Sunshine\"]"));
		    Hotel.click();
		    
		    WebElement RoomType = driver.findElement(By.xpath("//option[@value=\"Super Deluxe\"]"));
			RoomType.click();
			
			WebElement numberofrooms = driver.findElement(By.id("room_nos"));
			Select select=new Select(numberofrooms);
			select.selectByIndex(1);
			
			WebElement Adultscount = driver.findElement(By.id("adult_room"));
			Select select2=new Select(Adultscount);
			select2.selectByIndex(1);
			
            WebElement Childcount = driver.findElement(By.id("child_room"));
			
			Select select3=new Select(Childcount);
			select3.selectByIndex(1);
			
			WebElement Checkindate = driver.findElement(By.id("datepick_in"));
			seleniumBase.sendkeysByJava(Checkindate,"25/12/2025");
			
			WebElement Checkoutdate = driver.findElement(By.id("datepick_out"));
			Checkoutdate.sendKeys("26/12/2025");
			
			WebElement Search = driver.findElement(By.id("Submit"));
			Search.click();
			
			WebElement SelectHotel = driver.findElement(By.xpath("//td[contains(text(),'Select Hotel ')]"));
			System.out.println(SelectHotel.getText());
			
			seleniumBase.screenCapture2();
			
			WebElement Hotelname = driver.findElement(By.id("radiobutton_0"));
			Hotelname.click();
			
			driver.findElement(By.id("continue")).click();
			
			WebElement Bookahotel = driver.findElement(By.xpath("//td[contains(.,'Book A Hotel')]"));
			System.out.println(Bookahotel.getText());
			
			seleniumBase.screenCapture2();
			
			WebElement Firstname = driver.findElement(By.id("first_name"));
			Firstname.sendKeys("Alekhya");
			
			WebElement Lastname = driver.findElement(By.id("last_name"));
			Lastname.sendKeys("Katakam");
			
			WebElement Billingaddress = driver.findElement(By.id("address"));
			Billingaddress.sendKeys("Chennai,India.");
			
			WebElement CCno = driver.findElement(By.id("cc_num"));
			CCno.sendKeys("5412134545614567");
			
			WebElement CCType = driver.findElement(By.id("cc_type"));
			Select selectt=new Select(CCType);
			selectt.selectByIndex(2);
			
			driver.findElement(By.xpath("//option[@value=\"12\"]")).click();
			
			WebElement CCexpyr = driver.findElement(By.id("cc_exp_year"));
			Select selecttexpyr=new Select(CCexpyr);
			selecttexpyr.selectByIndex(10);
			
			WebElement CC_ccv = driver.findElement(By.id("cc_cvv"));
			CC_ccv.sendKeys("345");
			
			driver.findElement(By.id("book_now")).click();
						
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

			WebElement orderNumberEl = wait.until(
			    ExpectedConditions.visibilityOfElementLocated(
			        By.xpath("//input[@id='order_no']")
			    )
			);
			

			System.out.println(orderNumberEl.getAttribute("value"));
						
			seleniumBase.screenCapture2();
			
			Thread.sleep(10000);
			
			driver.findElement(By.id("my_itinerary")).click();
			
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

			WebElement checkAll = wait1.until(
			    ExpectedConditions.elementToBeClickable(By.xpath("//input[@onclick=\"checkall(this.form)\"]"))
			);

			checkAll.click();
			
			
			driver.findElement(By.xpath("//input[@value=\"Cancel Selected\"]")).click();
			
			Alert alert = driver.switchTo().alert();
			alert.accept();
			
			seleniumBase.screenCapture2();
			
			driver.findElement(By.id("logout")).click();
			
			driver.findElement(By.xpath("//a[contains(text(),'Click here to login again')]")).click();
			
			seleniumBase.screenCapture2();	
			
				
		
		}

		
	}

