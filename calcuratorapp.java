import java.util.Scanner;

public class calcuratorapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�� ������ �����ڸ� �Է��Ͻÿ�");
		
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
		}else System.out.println("��Ģ������ �Է����ֽʽÿ�.");
		
		System.out.println(result);
	}

}
