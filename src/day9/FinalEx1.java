package day9;

public class FinalEx1 {

	public static void main(String[] args) {
		A a = new A();
		a.print();
		B b = new B();
		b.print();
		int arr[] = new int[10];
		System.out.println(arr.length);
		Array array = new Array(5);
		array.push(1);
		array.push(2);
		array.push(3);
		array.push(4);
		for(int i=0; i<5; i++) {
			System.out.println(array.pop());
		}
	}
	
}
/*final*/ class A{
	/*final*/ public void print() {
		System.out.println("A클래스 입니다.");
	}
}
class B extends A{
	public void print() {
		System.out.println("B클래스 입니다.");
	}
}
class Array{
	public final int length;
	private int arr[];
	private int index = 0;
	public Array() {
		length = 10;
		arr = new int[length];
	}
	public Array(int num) {
		length = num;
		arr = new int[length];
	}
	public void push(int num) {
		if(index<length) {
			arr[index] = num;
			index++;
		}
	}
	public int get(int index) {
		if(this.index>index) {
			return arr[index];
		}
		return 0;
	}
	public int pop() {
		if(index ==0) {
			return 0;
		}
		index--;
		return arr[index];
	}
}