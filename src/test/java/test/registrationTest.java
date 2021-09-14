package test;
import test.registration;
public class registrationTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QTbotsManager mn=new QTbotsDriverClass();
		mn.launchBrowser();
		mn.loginQTbots();
		registration.fillForm();
		mn.closebrowser();
	}

}
