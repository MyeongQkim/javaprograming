 class Circle implements Shape {
		
	private int radius;
	public Circle(int a) {
		this.radius = a;
	}
	public double getArea() {
		return PI*radius*radius;
	}
	public void draw() {
		System.out.println("�������� "+ radius+"�� ���Դϴ�.");
	}
}
class Oval implements Shape {
	private int rectA,rectB;
	public Oval (int a, int b) {
		rectA = a;
		rectB = b;
	}
	public double getArea() {
		return PI*rectA*rectB;
	}
	public void draw() {
		System.out.println( rectA+"X" +rectB+"�� �����ϴ�Ÿ���Դϴ�."); // Ÿ���� ���̴� PI*rectA/2*rectB/2 �̳� ������ ���� ����� ���� �����Ͽ���. 
	}
	
}
class Rect implements Shape {
	private int Base,Height;
	public Rect (int a, int b) {
		Base = a;
		Height= b;
	}
	public double getArea() {
		return Base*Height;
	}
	public void draw() {
		System.out.println( Base+"X" +Height+"ũ���� �簢���Դϴ�.");
	}
	
}


public class totalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shape[] list = new Shape[3]; // Shape�� ��ӹ��� Ŭ���� ��ü�� ���۷��� �迭
		 list[0] = new Circle(10); // �������� 10�� �� ��ü
		 list[1] = new Oval(20, 30); // 20x30 �簢���� �����ϴ� Ÿ��
		 list[2] = new Rect(10, 40); // 10x40 ũ���� �簢��
		 for(int i=0; i<list.length; i++) list[i].redraw();
		 for(int i=0; i<list.length; i++) System.out.println("������ "+ list[i].getArea());
	}

}
