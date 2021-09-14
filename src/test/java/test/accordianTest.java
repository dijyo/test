package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.WidgetClass;

public class accordianTest extends BaseClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QTbotsManager mn=new QTbotsDriverClass();
		mn.launchBrowser();
		mn.loginQTbots();
		WidgetClass.clickWidgetTest();
		WidgetClass.clickAccordian();
		WidgetClass.getAccordianText();
		mn.closebrowser();
	}

}

