package google;

import org.testng.annotations.Test;

import actions.MapPageActions;
import actions.NewsPageActions;
import actions.ShoppingPageActions;

public class MainTest extends BaseTest {
	MapPageActions mapPageActions = null;
	NewsPageActions newsPageActions = null;
	ShoppingPageActions shoppingPageActions = null;
	
	@Test
	public void google() throws InterruptedException {
		mapPageActions=homePageActions.addToHomePage();
	}
	@Test(dependsOnMethods="google")
	public void map() throws InterruptedException {
		newsPageActions=mapPageActions.AddToMap();
	}
	@Test(dependsOnMethods="map")
	public void news() throws InterruptedException {
		shoppingPageActions=newsPageActions.AddToNews();
	}
	@Test(dependsOnMethods="news")
	public void shop() throws InterruptedException {
		shoppingPageActions.AddToShopping();
			 
	}
}
	


