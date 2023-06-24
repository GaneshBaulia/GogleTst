package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import common.Common;

public class ShoppingPageElements extends Common{
	
	public ShoppingPageElements (WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@title='Google apps']")
	public WebElement googleMapB2;
	
	@FindBy(name="app")
	public WebElement f;
	
	@FindBy(name="q")
	public WebElement googleSearch;
	
	@FindBy(xpath="//input[@type='text']")
	public WebElement newsSearch;
	
	@FindBy(name="q")
	public WebElement shoppingSearch;
}
