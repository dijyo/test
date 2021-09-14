package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WidgetClass extends BaseClass{

	public static void clickWidgetTest() {
		waitExplicit(driver.findElement(By.xpath("//button[contains(text(),'Widget')]")));
		
		driver.findElement(By.xpath("//button[contains(text(),'Widget')]")).click();
	}
	
	public static void clickAccordian() {
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'Accordian')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Accordian')]")).click();
	}
	
	public static void clickAutocomplete() {
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'AutoComplete')]")));
		driver.findElement(By.xpath("//a[contains(text(),'AutoComplete')]")).click();
	}
	
	public static void getAccordianText() {
		WebElement ele=driver.findElement(By.xpath("//button[contains(text(),'Section 1')]"));
		waitExplicit(ele);
		ele.click();
		waitExplicit(driver.findElement(By.xpath("//button[contains(text(),'Section 1')]/../div[1]/p")));
		System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Section 1')]/../div[1]/p")).getText());
			
		 ele=driver.findElement(By.xpath("//button[contains(text(),'Section 2')]"));
		waitExplicit(ele);
		ele.click();
		waitExplicit(driver.findElement(By.xpath("//button[contains(text(),'Section 2')]/../div[2]/p")));
		System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Section 2')]/../div[2]/p")).getText());
			
		 ele=driver.findElement(By.xpath("//button[contains(text(),'Section 3')]"));
		waitExplicit(ele);
		ele.click();
		waitExplicit(driver.findElement(By.xpath("//button[contains(text(),'Section 3')]/../div[3]/p")));
		System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Section 3')]/../div[3]/p")).getText());
			
	}
	
	public static void selectCountry(String country) throws InterruptedException {
		
		WebElement eleCountry=driver.findElement(By.id("myInput"));
		waitExplicit(eleCountry);
		eleCountry.click();
		eleCountry.sendKeys("i");
		List<WebElement> liCountry=driver.findElements(By.xpath("//div[@id='myInputautocomplete-list']/div"));
		Thread.sleep(3000);
		//System.out.println(liCountry.size());
		for(int i=0;i<liCountry.size();i++) {
			
			if(liCountry.get(i).getText().contains(country))
			{	liCountry.get(i).click();
			System.out.println(country+" is successfully selected");
			}
			
		}
	}
}
