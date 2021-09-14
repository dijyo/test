package test;
import test.FileUploadClass;
public class fileUploadTest extends BaseClass{

	public static void main(String[] args) throws Exception {
		QTbotsManager mn=new QTbotsDriverClass();
		mn.launchBrowser();
		mn.loginQTbots();
		FileUploadClass.clickFileUpload();
		FileUploadClass.upload();
		mn.closebrowser();
	}

}
