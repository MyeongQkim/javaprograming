
interface Shape {

	final double PI = 3.14;
	void draw(); /// 도형을 그림 - 반지름이 ~~ 인 원입니다.
	double getArea(); // 면적은 ~~~ 
	default public void redraw() { 
		System.out.print("--- 다시그립니다.");
		draw();
	}

}
