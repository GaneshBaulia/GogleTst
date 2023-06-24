package actions;

import org.openqa.selenium.WebDriver;
import elements.MapPageElements;

public class MapPageActions extends MapPageElements{
	
	public MapPageActions (WebDriver driver) {
	super(driver);
	}
	public NewsPageActions AddToMap() throws InterruptedException {
		 googleMapB.click();
		 
		 driver.switchTo().frame(f);
		 Thread.sleep(3000);
		 
		 news.click();
		 Thread.sleep(3000);
		 
		 driver.switchTo().defaultContent();
		 Thread.sleep(3000);
		
		return new  NewsPageActions(driver);	
	}
}
