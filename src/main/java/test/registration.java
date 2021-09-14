package test;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class registration extends BaseClass{
	public static void fillForm() {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("name"))));

		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys("Jyotsna");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("lname"))));
		driver.findElement(By.id("lname")).click();
		driver.findElement(By.id("lname")).sendKeys("Patil");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("postaladdress"))));

		driver.findElement(By.id("postaladdress")).click();
		driver.findElement(By.id("postaladdress")).sendKeys("Mumbai, Maharashtra");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("personaladdress"))));

		driver.findElement(By.id("personaladdress")).click();
		driver.findElement(By.id("personaladdress")).sendKeys("India");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@value='female']"))));

		driver.findElement(By.xpath("//input[@value='female']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("city"))));

		Select seCity=new Select(driver.findElement(By.id("city")));
		seCity.selectByVisibleText("MUMBAI");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("course"))));

		Select seCourse=new Select(driver.findElement(By.id("course")));
		seCourse.selectByIndex(1);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("district"))));

		Select seDistrict=new Select(driver.findElement(By.id("district")));
		seDistrict.selectByValue("mumbai");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("state"))));

		Select sestate=new Select(driver.findElement(By.id("state")));
		sestate.selectByVisibleText("GOA");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("pincode"))));

		driver.findElement(By.id("pincode")).click();
		driver.findElement(By.id("pincode")).sendKeys("400602");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("emailid"))));

		driver.findElement(By.id("emailid")).click();
		driver.findElement(By.id("emailid")).sendKeys("test@gmail.com");
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'Submit')]"))));

		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();

	}
}
