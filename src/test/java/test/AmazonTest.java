package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest extends BaseClass{

	public static void main(String[] args) {
		
		startBrowser();
		search();
		
	/*	WebElement elePrime=driver.findElement(By.xpath("//span[contains(text(),'All Prime')]"));
		waitExplicit(elePrime);
		elePrime.click();
		
		WebElement eleReview=driver.findElement(By.xpath("//section[@aria-label='4 Stars & Up']"));
		waitExplicit(eleReview);
		eleReview.click();
		
		WebElement eledelivery=driver.findElement(By.xpath("//span[contains(text(),'Get It by Tomorrow')]"));
		waitExplicit(eledelivery);
		eledelivery.click();
		
		*/
		
		WebElement eleproduct=driver.findElement(By.xpath("//li[@id='n/7072561011']"));
		waitExplicit(eleproduct);
		eleproduct.click();
		
		
		//stopBrowser();
	}
	
	public static void startBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		}
	public static void search() {
		WebElement elesearchbox=driver.findElement(By.id("twotabsearchtextbox"));
		waitExplicit(elesearchbox);
		elesearchbox.sendKeys("mobile");
		
		WebElement elesearchbutton=driver.findElement(By.id("nav-search-submit-button"));
		waitExplicit(elesearchbutton);
		elesearchbutton.click();
		
		WebElement eleresult=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
		waitExplicit(eleresult);
		System.out.println(eleresult.getText());
	}
	
	
	public static void stopBrowser() {
		driver.quit();
	}
}
