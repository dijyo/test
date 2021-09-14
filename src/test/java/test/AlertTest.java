package test;
import test.SwitchTo;

public class AlertTest extends BaseClass {

	public static void main(String[] args) throws Exception {
		QTbotsManager mn=new QTbotsDriverClass();
		mn.launchBrowser();
		mn.loginQTbots();
		SwitchTo.clickSwitchTo();
		SwitchTo.clickAlert();
		System.out.println(SwitchTo.getAlertText());
		
		SwitchTo.promptAlert();
		SwitchTo.frameAlert();
		mn.closebrowser();
	}

}
