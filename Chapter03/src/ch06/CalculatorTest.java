package ch06;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1=10;
		int num2=2;
		Calc calc = new CompleteCalc();
		calc.add(num1, num2);
		System.out.println(num1 + "+" + num2 + "=" + calc.add(num1, num2));
		System.out.println(num1 + "-" + num2 + "=" + calc.substract(num1, num2));
		System.out.println(num1 + "*" + num2 + "=" + calc.times(num1, num2));
		System.out.println(num1 + "/" + num2 + "=" + calc.divide(num1, num2));
	}

}
