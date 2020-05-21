 class Circle implements Shape {
		
	private int radius;
	public Circle(int a) {
		this.radius = a;
	}
	public double getArea() {
		return PI*radius*radius;
	}
	public void draw() {
		System.out.println("반지름이 "+ radius+"인 원입니다.");
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
		System.out.println( rectA+"X" +rectB+"에 내접하는타원입니다."); // 타원의 넓이는 PI*rectA/2*rectB/2 이나 예제와 같이 만들기 위해 수정하였다. 
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
		System.out.println( Base+"X" +Height+"크기의 사각형입니다.");
	}
	
}


public class totalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shape[] list = new Shape[3]; // Shape을 상속받은 클래스 객체의 레퍼런스 배열
		 list[0] = new Circle(10); // 반지름이 10인 원 객체
		 list[1] = new Oval(20, 30); // 20x30 사각형에 내접하는 타원
		 list[2] = new Rect(10, 40); // 10x40 크기의 사각형
		 for(int i=0; i<list.length; i++) list[i].redraw();
		 for(int i=0; i<list.length; i++) System.out.println("면적은 "+ list[i].getArea());
	}

}
