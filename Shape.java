
interface Shape {

	final double PI = 3.14;
	void draw(); /// ������ �׸� - �������� ~~ �� ���Դϴ�.
	double getArea(); // ������ ~~~ 
	default public void redraw() { 
		System.out.print("--- �ٽñ׸��ϴ�.");
		draw();
	}

}
