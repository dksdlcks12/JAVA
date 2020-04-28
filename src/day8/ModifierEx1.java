package day8;

public class ModifierEx1 {

	public static void main(String[] args) {
		D d= new D();
		Object o1 = new Object();
		A a1 = new A();
		B b1 = new B();
		d.print1(o1);
		d.print1(a1);
		d.print2(b1);
		d.print1(new A()); // A는 익명 개체
	}

}

final class A {	// final 클래스는 부모 클래스 X
	public int a;
}
class B{
	public final void print() {	//final 메소드는 오버라이딩X
		System.out.println("B");
	}
}
class C extends B{
	public final int num; // 명시적 초기화를 하지 않을 경우 생성자를 이용하여 초기화를 할 수 있다.
	public C() {
		num = 0;
	}
	public C(int num) {
		this.num = num;
	}
}

class D{
	//매개변수로 클래스 Object의 객체 obj가 오면 실제 넣어주는 정보는
	//Object 클래스의 객체도 가능하지만 Object 클래싀 자식 클래스들도 가능
	public void print1(Object obj) {
		if(obj instanceof A) { // instanceof - obj객체가 클래스 A로 형변환 가능한지를 확인하는 연산
			System.out.println("A클래스로 형 변환이 가능 합니다.");
		}else {
			System.out.println("Obj 입니다.");
		}
	}
	//매개변수로 B클래스의 객체 obj가 오기 때문에 실제 정보는 B클래스의 객체나 B클래스를 상속받은 A객체를 매개변수로 넣어줄 수 있다.
	public void print2(B obj) {
		System.out.println("B 입니다.");
	}
}