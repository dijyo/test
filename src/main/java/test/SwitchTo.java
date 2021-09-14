package test;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class SwitchTo extends BaseClass{

	public static void clickSwitchTo() {
		waitExplicit(driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")));
		
		driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")).click();
	}
	
	public static void clickAlert() {
		
			waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'Alert')]")));
			driver.findElement(By.xpath("//a[contains(text(),'Alert')]")).click();
				
	}
	
	public static void clickWindows() {
		
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'Windows')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Windows')]")).click();
			
}
	public static void clickTabs() {
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'Tabs')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Tabs')]")).click();
		
	}
	public static String getAlertText() {
		WebElement eletopAlert=driver.findElement(By.xpath("(//button[contains(text(),'Window Alert')])[1]"));
		waitExplicit(eletopAlert);
		eletopAlert.click();
		Alert topAlert=driver.switchTo().alert();
		String alertText= topAlert.getText();
		topAlert.accept();
		return alertText;
			}
	
	public static void promptAlert() {
		
		WebElement elePromptAlert=driver.findElement(By.xpath("//button[contains(text(),'Promt Alert')]"));
		waitExplicit(elePromptAlert);
		elePromptAlert.click();
		Alert prAlert=driver.switchTo().alert();
		prAlert.sendKeys("OK");
		prAlert.dismiss();
	}
	
	public static void frameAlert() {
		WebElement elefrAlert=driver.findElement(By.xpath("(//button[contains(text(),'Window Alert')])[2]"));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", elefrAlert);

		waitExplicit(elefrAlert);
		elefrAlert.click();
		Alert topAlert=driver.switchTo().alert();
		topAlert.accept();

	}
	
	public static void clickTabWindow() {
		
		String currentWindow=driver.getWindowHandle();

		WebElement eleTab=driver.findElement(By.xpath("//button[contains(text(),'Tab')]"));
		waitExplicit(eleTab);
		eleTab.click();
		ArrayList<String> litabs=new ArrayList(driver.getWindowHandles());
		System.out.println(litabs);
		driver.switchTo().window(litabs.get(1));
		driver.get("https://amazon.com");
		driver.close();
		driver.switchTo().window(currentWindow);
		
		WebElement eleWindow=driver.findElement(By.xpath("//button[contains(text(),'Window')]"));
		waitExplicit(eleWindow);
		eleWindow.click();
		ArrayList<String> liwindows=new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(liwindows.get(1));
		driver.close();
		driver.quit();
	}
	public static void getTabText() {
		
		WebElement elelondon=driver.findElement(By.xpath("//button[contains(text(),'London')]"));
		waitExplicit(elelondon);
		elelondon.click();
		System.out.println(driver.findElement(By.xpath("//div[@id='London']")).getText());
		
		WebElement eleparis=driver.findElement(By.xpath("//button[contains(text(),'Paris')]"));
		waitExplicit(eleparis);
		eleparis.click();
		System.out.println(driver.findElement(By.xpath("//div[@id='Paris']")).getText());
		
		WebElement eletokyo=driver.findElement(By.xpath("//button[contains(text(),'Tokyo')]"));
		waitExplicit(eletokyo);
		eletokyo.click();
		System.out.println(driver.findElement(By.xpath("//div[@id='Tokyo']")).getText());
	}
}
