package day13;

public class ObjectEx1 {

	public static void main(String[] args) {
		//클래스 A의 a1이라는 객체를 생성 후 a2라는 객체를 선언하고 a1의 인덱스를 대입한다.(a1을 참조한다.)  
		A a1 = new A();
		A a2 = a1;
		System.out.printf("%3d, %3d\n", a1.num, a2.num);
		a1.num = 20;
		System.out.printf("%3d, %3d\n", a1.num, a2.num);
		try {
			A a3 = (A)a1.clone();
			a3.num = 40;
			System.out.printf("%3d, %3d\n", a1.num, a3.num);
		}catch (Exception e) {
			
		}
		B b1 = new B();
		b1.a = new A();
		b1.a.num = 10;
		B b2 = b1.clone();
		b2.a.num = 30;
		System.out.printf("%3d, %3d\n", b1.a.num, b2.a.num);
		A a4 = new A();
		A a5 = new A();
		System.out.printf("%3d, %3d\n", a4.num, a5.num);
		System.out.println(a4.equals(a5));
		C c = new C();
		System.out.println(c);
	}
}
class A implements Cloneable{
	int num;
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public A(int num) {
		this.num = num;
	}
	public A() {
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (num != other.num)
			return false;
		return true;
	}
	
}
class B implements Cloneable{
	A a;
	public B clone() {
		B obj = null;
		try {
			obj = (B)super.clone();
			
		}catch (Exception e) {
			System.out.println("예외");
		}
		if(obj instanceof B) {
			obj.a = new A(((B)obj).a.num);
		}
		return (B)obj;
	}
}
class C {
	int num1, num2, num3, num4, num5;

	@Override
	public String toString() {
		return "C [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4 + ", num5=" + num5 + "]";
	}

}
