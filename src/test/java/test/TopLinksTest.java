package test;

public class TopLinksTest {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		QTbotsManager mn=new QTbotsDriverClass();
		mn.launchBrowser();
		mn.loginQTbots();
		mn.clickSwitchTo();
		mn.clickIntractions();
		mn.clickWidget();
		mn.clickCalculator();
		mn.clickFileUpload();
		mn.clickLogout();
		mn.closebrowser();
		
	}

}
