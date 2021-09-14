package test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class datePickerPriceline extends BaseClass{

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.priceline.com");
		driver.manage().window().maximize();
		
		

		
		WebElement hotelDates=driver.findElement(By.id("hotelDates"));
		waitExplicit(hotelDates);
		hotelDates.click();
		
		WebElement fromDate=driver.findElement(By.xpath("//div[@aria-label='"+getDate("20")+"']"));
	    waitExplicit(fromDate);
	    fromDate.click();
	    
	    WebElement toDate=driver.findElement(By.xpath("//div[@aria-label='"+getDate("24")+"']"));
	    waitExplicit(toDate);
	    toDate.click();
		//driver.quit();
	    
	    WebElement rooms=driver.findElement(By.xpath("//div[contains(text(),'2 Adults, 1 Room')]"));
	    waitExplicit(rooms);
	    rooms.click();
	    waitExplicit(driver.findElement(By.xpath("//button[@aria-label='Increase Children']")));
	    driver.findElement(By.xpath("//button[@aria-label='Increase Children']")).click();
	    driver.findElement(By.xpath("//button[@aria-label='Increase Children']")).click();
	    waitExplicit(driver.findElement(By.id("traveler-selection-done-button")));
	    driver.findElement(By.id("traveler-selection-done-button")).click();
	    
	    
	    waitExplicit(driver.findElement(By.id("endLocation-typeahead-downshift-container-input")));
		driver.findElement(By.id("endLocation-typeahead-downshift-container-input")).click();
		driver.findElement(By.id("endLocation-typeahead-downshift-container-input")).sendKeys("Florida, NY");
		
		
	    waitExplicit(driver.findElement(By.xpath("//button[contains(text(),'Find Your Hotel')]")));
	    driver.findElement(By.xpath("//button[contains(text(),'Find Your Hotel')]")).click();
	    //driver.quit();
	}
	
	public static String getDate(String date1) {
		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd yyyy");  
	    String strDate = formatter.format(date);  
	    String[] arrDate=strDate.split(" ");
	   
	    arrDate[1]=date1;
	    //aria-label="September 15, 2021"
	    String newDate=arrDate[0]+" "+arrDate[1]+", "+arrDate[2];
	  //  System.out.println(newDate);
		return newDate;
	}

}
