
abstract class calc {

	abstract void setValue(int a, int b);
	abstract int calculate();
}

class Add extends calc{
	
	int a, b;
	public void setValue(int a, int b){
	 this.a= a;
	 this.b= b;
	}
	
	public int calculate() {
		return a+b;
	}
}
class Sub extends calc{
	
	int a, b;
	public void setValue(int a, int b){
	 this.a= a;
	 this.b= b;
	}
	
	public int calculate() {
		return a-b;
	}
}
class Mul extends calc{
	
	int a, b;
	public void setValue(int a, int b){
	 this.a= a;
	 this.b= b;
	}
	
	public int calculate() {
		return a*b;
	}
}
class Div extends calc{
	
	int a, b;
	public void setValue(int a, int b){
	 this.a= a;
	 this.b= b;
	}
	
	public int calculate() {
		return a/b;
	}	
}
