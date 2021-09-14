package test;
import test.intraction;

public class DoubleClickTest extends BaseClass {

	public static void main(String[] args) throws Exception {
		QTbotsManager mn=new QTbotsDriverClass();
		mn.launchBrowser();
		mn.loginQTbots();
		intraction.clickIntractionTest();
		intraction.clickDoubleclick();
		intraction.doubleClick();
		mn.closebrowser();
	}

}
