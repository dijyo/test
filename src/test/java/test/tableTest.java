package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tableTest extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		waitExplicit(driver.findElement(By.xpath("//table[@class='dataTable']")));
		int rowcount=driver.findElements(By.xpath("//tbody/tr")).size();
		int colcount=driver.findElements(By.xpath("//thead/tr/th")).size();
		for(int i=1;i<colcount;i++)
			System.out.print(" \t"+driver.findElement(By.xpath("//thead/tr[1]/th["+i+"]")).getText());
		//System.out.println();
		for(int i=1;i<=rowcount;i++) {
			System.out.println();

			for(int j=1;j<=colcount;j++) {
				System.out.print(" \t"+driver.findElement(By.xpath("//tbody/tr["+i+"]/td["+j+"]")).getText());
				}
		}
		
		driver.quit();
	}

}
