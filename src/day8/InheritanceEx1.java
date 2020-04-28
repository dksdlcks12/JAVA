package day8;

public class InheritanceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1 = new Child();
		c1.print();
		c1.prt();
	}

}

class Child extends Parent{
	private int e;
	Point p1 = new Point();
	public void prt() {
		System.out.printf("%d,%d\n", p1.x, p1.y);
		System.out.printf("a =%2d, b =%2d, c =%2d, d =%2d, e=%2d\n", a, b, c, getD(), e);
	}
	
}
class Parent{
	public int a;
	protected int b;
	int c;
	private int d=10;
	public void print() {
		System.out.printf("a =%2d, b =%2d, c =%2d, d =%2d\n", a, b, c, d);
	}
	public Parent() {
		
	}
	public Parent(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	protected int getD() {
		return d;
	}
	protected void setD(int d) {
		this.d = d;
	}
	
}