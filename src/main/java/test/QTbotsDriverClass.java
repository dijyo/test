package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QTbotsDriverClass extends BaseClass implements QTbotsManager{
/*public void waitExplicit(WebElement ele) {
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOf(ele));
}*/
	@Override
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://qtbots-selenium.web.app/");
		driver.manage().window().maximize();
	}

	@Override
	public void loginQTbots() throws Exception {
		// TODO Auto-generated method stub
		waitExplicit(driver.findElement(By.id("email_field")));
		driver.findElement(By.id("email_field")).click();
		driver.findElement(By.id("email_field")).clear();
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");

		waitExplicit(driver.findElement(By.id("password_field")));
		driver.findElement(By.id("password_field")).click();
		driver.findElement(By.id("password_field")).clear();
		driver.findElement(By.id("password_field")).sendKeys("admin123");

		waitExplicit(driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]")).click();
	}

	@Override
	public void closebrowser() {
		// TODO Auto-generated method stub
		driver.quit();
	}

	@Override
	public void clickSwitchTo() {
		// TODO Auto-generated method stub
		waitExplicit(driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")).click();
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'Alert')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Alert')]")).click();
		waitExplicit(driver.findElement(By.xpath("//h2[contains(text(),'Text Container')]")));
		System.out.println("Switch To --> Alert");
	
		driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")).click();
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'Windows')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Windows')]")).click();
		waitExplicit(driver.findElement(By.xpath("//button[contains(text(),'Tab')]")));
		System.out.println("Switch To --> windows");

		driver.findElement(By.xpath("//button[contains(text(),'Switch To')]")).click();
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'Tabs')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Tabs')]")).click();
		waitExplicit(driver.findElement(By.xpath("//button[contains(text(),'London')]")));
		System.out.println("Switch To --> tabs");

	}

	@Override
	public void clickIntractions() {
		// TODO Auto-generated method stub
		waitExplicit(driver.findElement(By.xpath("//button[contains(text(),'Intractions')]")));
		
		driver.findElement(By.xpath("//button[contains(text(),'Intractions')]")).click();
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'Drag & Drop')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Drag & Drop')]")).click();
		waitExplicit(driver.findElement(By.xpath("//img[@id='drag1']")));
		System.out.println("Intractions --> Drag & Drop");

		driver.findElement(By.xpath("//button[contains(text(),'Intractions')]")).click();
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'Mouse Hover')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Mouse Hover')]")).click();
		waitExplicit(driver.findElement(By.xpath("//button[contains(text(),'mousehover')]")));
		System.out.println("Intractions --> Mouse Hover");

		driver.findElement(By.xpath("//button[contains(text(),'Intractions')]")).click();
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'Double Click')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Double Click')]")).click();
		waitExplicit(driver.findElement(By.xpath("//button[contains(text(),'single Click')]")));
		System.out.println("Intractions -->  Double Click");

		driver.findElement(By.xpath("//button[contains(text(),'Intractions')]")).click();
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'Tool Tip')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Tool Tip')]")).click();
		waitExplicit(driver.findElement(By.xpath("//div[contains(@class,'tooltipr')]")));
		System.out.println("Intractions --> tool tip ");

		}

	@Override
	public void clickWidget() {
		// TODO Auto-generated method stub
		waitExplicit(driver.findElement(By.xpath("//button[contains(text(),'Widget')]")));
		
		driver.findElement(By.xpath("//button[contains(text(),'Widget')]")).click();
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'Table')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Table')]")).click();
		waitExplicit(driver.findElement(By.xpath("//p[contains(text(),'Table')]")));
		System.out.println("Widget --> Table");

		driver.findElement(By.xpath("//button[contains(text(),'Widget')]")).click();
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'Accordian')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Accordian')]")).click();
		waitExplicit(driver.findElement(By.xpath("//button[contains(text(),'Section 1')]")));
		System.out.println("Widget --> accordian");
	
		driver.findElement(By.xpath("//button[contains(text(),'Widget')]")).click();
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'AutoComplete')]")));
		driver.findElement(By.xpath("//a[contains(text(),'AutoComplete')]")).click();
		waitExplicit(driver.findElement(By.xpath("//input[@id='myInput']")));
		System.out.println("Widget --> autocomplete");

		driver.findElement(By.xpath("//button[contains(text(),'Widget')]")).click();
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'Date Picker')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Date Picker')]")).click();
		waitExplicit(driver.findElement(By.xpath("//input[contains(@name,'bday')]")));
		System.out.println("Widget --> date picker");

	}

	@Override
	public void clickCalculator() {
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'Calculator')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Calculator')]")).click();
		waitExplicit(driver.findElement(By.xpath("//form[contains(@name,'calculator')]")));
		System.out.println("calculator");

	}

	@Override
	public void clickFileUpload() {
		// TODO Auto-generated method stub
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'File Upload')]")));
		driver.findElement(By.xpath("//a[contains(text(),'File Upload')]")).click();
		waitExplicit(driver.findElement(By.xpath("//input[@id='logo']")));
		System.out.println("file upload");

	}

	@Override
	public void clickLogout() {
		// TODO Auto-generated method stub
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	//	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h3[contains(text(),'Web login')]"))));
		System.out.println("logout");

	}

}
