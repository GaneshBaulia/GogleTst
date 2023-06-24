package actions;

import org.openqa.selenium.WebDriver;
import elements.HomePageElements;

public class HomePageActions extends HomePageElements {
	public HomePageActions(WebDriver driver) {
		super(driver);	
	}

	public  MapPageActions addToHomePage() throws InterruptedException {
		//Actions actions = new Actions(driver);
		googleAppA.click();
		 Thread.sleep(3000);
		 
		 driver.switchTo().frame(f);
		 Thread.sleep(3000);
		 
		 googleMap.click();
		 Thread.sleep(3000);
		 
		 driver.switchTo().defaultContent();
		 Thread.sleep(3000);
		return new MapPageActions(driver);
	}
}
