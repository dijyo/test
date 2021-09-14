package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class intraction extends BaseClass{

	public static void clickIntractionTest() {
		waitExplicit(driver.findElement(By.xpath("//button[contains(text(),'Intractions')]")));
		
		driver.findElement(By.xpath("//button[contains(text(),'Intractions')]")).click();
	}
	public static void clickMousehover() {
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'Mouse Hover')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Mouse Hover')]")).click();
	}
	public static void clickDoubleclick() {
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'Double Click')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Double Click')]")).click();
	}
	public static void clickTooltip() {
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'Tool Tip')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Tool Tip')]")).click();
		
	}
	public static void mouseHoverTest() throws Exception {
		WebElement mhbutton=driver.findElement(By.xpath("//button[contains(text(),'mousehover')]"));
		waitExplicit(mhbutton);
		Actions ac=new Actions(driver);
		ac.moveToElement(mhbutton).build().perform();
		//waitExplicit(driver.findElement(By.xpath("//div[@class='dropdown-content']/a[1]")));
		//driver.findElement(By.xpath("//div[@class='dropdown-content']/a[1]")).click();
		Thread.sleep(5000);
	}
	
	public static void doubleClick() {
		driver.get("https://qtbots-selenium.web.app/double-click.html");
		WebElement singleClickButton=driver.findElement(By.xpath("//button[contains(text(),'single Click')]"));
		waitExplicit(singleClickButton);
		singleClickButton.click();
		singleClickButton.click();
		singleClickButton.click();
		waitExplicit(driver.findElement(By.xpath("//p[@id='demo1']")));
		System.out.println(driver.findElement(By.xpath("//p[@id='demo1']")).getText());
		
		WebElement doubleClickButton=driver.findElement(By.xpath("//button[contains(text(),'Double Click')]"));
		waitExplicit(doubleClickButton);
		Actions ac=new Actions(driver);
		ac.doubleClick(doubleClickButton).build().perform();
		waitExplicit(driver.findElement(By.xpath("//p[@id='Selenium']")));
		System.out.println(driver.findElement(By.xpath("//p[@id='Selenium']")).getText());
	}
	public static void ToolTip(){
		WebElement tooltipr=driver.findElement(By.xpath("//div[@class='tooltipr']"));
		waitExplicit(tooltipr);
		Actions ac=new Actions(driver);
		ac.moveToElement(tooltipr).build().perform();
		waitExplicit(driver.findElement(By.xpath("//span[contains(text(),'Right')]")));
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Right')]")).getText());
	}
}
