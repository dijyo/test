package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface QTbotsManager {
	public void launchBrowser();
	public void loginQTbots() throws Exception;
	public void clickSwitchTo();
	public void clickIntractions();
	public void clickWidget();
	public void clickCalculator();
	public void clickFileUpload();
	public void clickLogout();
	public void closebrowser();
	//public void waitExplicit(WebElement ele);
	
}
