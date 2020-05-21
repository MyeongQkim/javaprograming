import java.util.Scanner;

public class calcuratorapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("두 정수와 연산자를 입력하시오");
		
		Scanner Scanner = new Scanner(System.in);
		int a = Scanner.nextInt();
		int b = Scanner.nextInt();
		char operator = Scanner.next().charAt(0);
		int result =0;
		calc Calc;
		
		if (operator =='+') {
			Calc = new Add();
			Calc.setValue(a, b);
			result = Calc.calculate();
		}
		else if (operator =='-') {
			Calc = new Sub();
			Calc.setValue(a, b);
			result = Calc.calculate();
		}else if (operator =='*') {
			Calc = new Mul();
			Calc.setValue(a, b);
			result = Calc.calculate();
		}else if (operator =='/') {
			Calc = new Div();
			Calc.setValue(a, b);
			result = Calc.calculate();
		}else System.out.println("사칙연산을 입력해주십시오.");
		
		System.out.println(result);
	}

}
