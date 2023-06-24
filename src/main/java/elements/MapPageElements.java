package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import common.Common;

public class MapPageElements  extends  Common {
	
	public MapPageElements (WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[@title='Google apps']")
	public WebElement googleMapB;
	
	@FindBy(name="app")
	public WebElement f;
	
	@FindBy(xpath="//a[@href='https://news.google.com']")
	public WebElement news;
}
