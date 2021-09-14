package test;
import test.CalculatorClass;
public class calculatorTest extends BaseClass{

	public static void main(String[] args) throws Exception {
		QTbotsManager mn=new QTbotsDriverClass();
		mn.launchBrowser();
		mn.loginQTbots();
		CalculatorClass.clickCalculator();

		System.out.println(CalculatorClass.add(7, 8));
		CalculatorClass.clickbutton("C");

		System.out.println(CalculatorClass.subtract(9, 4));
		CalculatorClass.clickbutton("C");

		System.out.println(CalculatorClass.multiply(7, 2));
		CalculatorClass.clickbutton("C");

		System.out.println(CalculatorClass.divide(8, 2));
		CalculatorClass.clickbutton("C");

		
		//mn.closebrowser();
	}

}
