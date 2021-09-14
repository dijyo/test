package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrameTest extends BaseClass{

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
		WebElement elepara=driver.findElement(By.id("tinymce"));

		waitExplicit(elepara);

		//elepara.clear();
		elepara.click();
		elepara.sendKeys("Hi, Here we are....");
		
		driver.quit();
	}

}
