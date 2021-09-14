package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CalculatorClass extends BaseClass {
	public static void clickCalculator() {
		waitExplicit(driver.findElement(By.xpath("//a[contains(text(),'Calculator')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Calculator')]")).click();
			}
	
	public static void clickbutton(String input) throws Exception {
		WebElement eleinput=driver.findElement(By.xpath("//input[@value='"+input+"']"));
	//	Thread.sleep(1000);

		waitExplicit(eleinput);
		eleinput.click();
	}
	
	public static String add(int a,int b) throws Exception {
		String sa=Integer.toString(a);
		String sb=Integer.toString(b);
		
		clickbutton(sa);
		clickbutton("+");

		clickbutton(sb);
		clickbutton("=");
		Thread.sleep(3000);
		waitExplicit(driver.findElement(By.id("display")));
		String result=driver.findElement(By.id("display")).getText();
		return(sa+"+"+sb+"="+result);
	}
	
	public static String subtract(int a,int b) throws Exception {
		String sa=Integer.toString(a);
		String sb=Integer.toString(b);
		
		clickbutton(sa);
		clickbutton("-");

		clickbutton(sb);
		clickbutton("=");
		Thread.sleep(3000);

		waitExplicit(driver.findElement(By.id("display")));
		String result=driver.findElement(By.id("display")).getText();
		return(sa+"-"+sb+"="+result);
		}
	
	public static String multiply(int a,int b) throws Exception {
		String sa=Integer.toString(a);
		String sb=Integer.toString(b);
		
		clickbutton(sa);
		clickbutton("x");

		clickbutton(sb);
		clickbutton("=");
		Thread.sleep(3000);

		waitExplicit(driver.findElement(By.id("display")));
		String result=driver.findElement(By.id("display")).getText();
		return(sa+"X"+sb+"="+result);
		
	}
	
	public static String divide(int a,int b) throws Exception {
		String sa=Integer.toString(a);
		String sb=Integer.toString(b);
		
		clickbutton(sa);
		clickbutton("/");

		clickbutton(sb);
		clickbutton("=");
		Thread.sleep(3000);

		waitExplicit(driver.findElement(By.id("display")));
		String result=driver.findElement(By.id("display")).getText();
		return(sa+"/"+sb+"="+result);	}
}
