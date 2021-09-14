package test;
import test.WidgetClass;

public class AutoCompleteTest extends BaseClass{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QTbotsManager mn=new QTbotsDriverClass();
		mn.launchBrowser();
		mn.loginQTbots();
		WidgetClass.clickWidgetTest();
		WidgetClass.clickAutocomplete();
		WidgetClass.selectCountry("India");
		mn.closebrowser();
	}

}
