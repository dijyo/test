package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadClass  extends BaseClass{
	public static void clickFileUpload() {
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'File Upload')]")));
		driver.findElement(By.xpath("//a[contains(text(),'File Upload')]")).click();
			}
	
	public static void upload() {
		
		WebElement eleuploadButton=driver.findElement(By.id("logo"));
		waitExplicit(eleuploadButton);
		eleuploadButton.sendKeys(System.getProperty("user.dir")+"/apple.jpg");
		if(driver.findElement(By.xpath("//div[@class='imagearea']/img")).isDisplayed()) 
			System.out.println("file is uploaded successfully");
			else
				System.out.println("file upload failed");
		
	}
}
