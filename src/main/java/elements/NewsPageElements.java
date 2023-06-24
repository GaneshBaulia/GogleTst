package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import common.Common;

public class NewsPageElements  extends Common{
	
	public NewsPageElements (WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a[@title='Google apps']")
	public WebElement googleMapB1;
	
	@FindBy(name="app")
	public WebElement f;
	
	@FindBy(xpath="//a[@href='https://www.google.com/shopping?source=og']")
	public WebElement shopping;
}
