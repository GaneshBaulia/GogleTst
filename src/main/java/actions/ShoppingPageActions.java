package actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import elements.ShoppingPageElements;

public class ShoppingPageActions extends ShoppingPageElements{

	public ShoppingPageActions(WebDriver driver) {
		super(driver);
	}
	
	public void AddToShopping() throws InterruptedException {
		
		 googleMapB2.click();
		 
		 driver.switchTo().frame(f);
		 Thread.sleep(3000);
		 
		 Set<String>listofWin = driver.getWindowHandles();
		 Iterator<String>it = listofWin.iterator();
		 
		 String mainwin = it.next();
		 String win1 = it.next();
		 String win2 = it.next();
		 
		 driver.switchTo().window(mainwin);
		 Thread.sleep(4000);
		 
		 googleSearch.sendKeys("Bar Harbor ME");
		 Thread.sleep(4000);
		 
		 driver.switchTo().window(win1);
		 Thread.sleep(4000);
		 
		 newsSearch.sendKeys("Trump");
		 Thread.sleep(4000);
		 
		 driver.switchTo().window(win2);
		 Thread.sleep(4000);
		 
		 shoppingSearch.sendKeys("Keyboard");
		 Thread.sleep(4000);
	}
}
