package actions;

import org.openqa.selenium.WebDriver;

import elements.NewsPageElements;

public class NewsPageActions extends NewsPageElements {

	public NewsPageActions(WebDriver driver) {
		super(driver);
		
	}
	public  ShoppingPageActions AddToNews() throws InterruptedException {
		googleMapB1.click();
		
		 driver.switchTo().frame(f);
		 Thread.sleep(3000);
		 
		 shopping.click();
		 Thread.sleep(3000);
		 
		 driver.switchTo().defaultContent();
		 Thread.sleep(3000);
		return new ShoppingPageActions(driver);
	}
}
