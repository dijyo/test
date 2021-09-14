package test;

import org.openqa.selenium.WebDriver;

public class loginPageTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QTbotsManager mn=new QTbotsDriverClass();
		mn.launchBrowser();
		mn.loginQTbots();
		mn.closebrowser();
	}

}
