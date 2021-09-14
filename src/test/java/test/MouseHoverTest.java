package test;
import test.intraction;
public class MouseHoverTest extends BaseClass{

	public static void main(String[] args) throws Exception {
		QTbotsManager mn=new QTbotsDriverClass();
		mn.launchBrowser();
		mn.loginQTbots();
		intraction.clickIntractionTest();
		intraction.clickMousehover();
		mn.closebrowser();

	}

}
