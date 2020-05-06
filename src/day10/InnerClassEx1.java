package day10;

public class InnerClassEx1 {

	public static void main(String[] args) {

		C c = new C();
		test(c);
		// 인터페이스 B를 구현한 클래스를 아래에서 바로 만든 후 만들어진 클래스의 객체를 매개변수로 전달하여 test메소드를 실행
		test(new B() {
			public void func() {
				
			}
		});
	}
	public static void test(B b) {
		
	}
}
class A{
	
}
interface B{
	
}
class C implements B{
	public void func() {}
}