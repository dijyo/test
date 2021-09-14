package test;
import test.SwitchTo;
public class WindowsTest extends BaseClass{

	public static void main(String[] args) throws Exception {
		QTbotsManager mn=new QTbotsDriverClass();
		mn.launchBrowser();
		mn.loginQTbots();
		SwitchTo.clickSwitchTo();

		SwitchTo.clickWindows();
		SwitchTo.clickTabWindow();
	}

}
