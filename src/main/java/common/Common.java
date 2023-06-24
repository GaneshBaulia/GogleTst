package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Common {
	public WebDriver driver = null;
	public Common (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements (driver,this);
	}
}
