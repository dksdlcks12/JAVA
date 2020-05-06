package day10;

public class AbstractEx1 {

	public static void main(String[] args) {
		
	}

}
abstract class A1 {
	int a;
	public void print() {
		System.out.println(a);
	}
	public abstract void test();
}
abstract class B1 extends A1 {
	public void test() {
		System.out.println();
	}
}