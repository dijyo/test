package test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datePickerKayak extends BaseClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.kayak.com/");
		driver.manage().window().maximize();
		
		waitExplicit(driver.findElement(By.xpath("(//span[@class='cQtq-date'])[1]")));
		driver.findElement(By.xpath("//span[@class='cQtq-date']")).click();
		
		WebElement fromDate=driver.findElement(By.xpath("//div[@aria-label='"+getDate("20")+"']"));
	    waitExplicit(fromDate);
	    fromDate.click();
	    
	    WebElement toDate=driver.findElement(By.xpath("//div[@aria-label='"+getDate("24")+"']"));
	    waitExplicit(toDate);
	    toDate.click();
		//09/14/2021
		
	    WebElement eletime=driver.findElement(By.xpath("//ul[@class='c4P1Q-list']"));
	    waitExplicit(eletime);
	    eletime.findElement(By.xpath("//li[contains(text(),'2:00 pm')]")).click();
	    
	    WebElement elefrom=driver.findElement(By.xpath("//div[@class='lNCO-inner']"));
	    waitExplicit(elefrom);
	    elefrom.click();
	    waitExplicit(driver.findElement(By.xpath("//input[@class='k_my-input']")));
	    //driver.findElement(By.xpath("//input[@class='k_my-input']")).click();
	    driver.findElement(By.xpath("//input[@class='k_my-input']")).sendKeys("New York, United States");
	    
	    WebElement elesearch=driver.findElement(By.xpath("(//div[@class='Iqt3-button-content'])[3]"));
	    waitExplicit(elesearch);
	    elesearch.click();
	    
	  //  Alert topAlert=driver.switchTo().alert();
		//topAlert.accept();

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
