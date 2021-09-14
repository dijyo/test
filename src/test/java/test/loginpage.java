package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginpage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://qtbots-selenium.web.app/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("email_field")).click();
		driver.findElement(By.id("email_field")).clear();
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");

		driver.findElement(By.id("password_field")).click();
		driver.findElement(By.id("password_field")).clear();
		driver.findElement(By.id("password_field")).sendKeys("admin123");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]")).click();
		Thread.sleep(5000);

		driver.close();
		driver.quit();

	}

}
