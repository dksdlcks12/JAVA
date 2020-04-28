package day8;

public class OverridingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck d = new Duck();
		d.cry();
		Sparrow s = new Sparrow();
		s.cry();
		s.cry(0);
		System.out.println(s.getWing());
		Sparrow s2 = new Sparrow(1);
		System.out.println(s2.getWing());
	}

}

class Bird {
	protected int wing;
	public void cry() {
		System.out.println("새가 웁니다.");
	}
	public Bird() {
		wing = 2;
	}
	public Bird(int wing) {
		this.wing = wing;
	}
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	
}
class Duck extends Bird{
	@Override 
	public void cry() { // 오버라이딩
		super.cry(); // 주로 메소드 오버라이딩 할 때 사용
	//	cry(); 라고 작성하면 재귀호출이 되어 스택 오버플로우 되어 에러 발생
		System.out.println("오리 : 꽥꽥");
	} 	
//	public Duck()
//		super(); -> 생략 가능
//	} -> 생성자가 하나도 없으면 기본생성자가 자동으로 생성이 된다.
}
class Sparrow extends Bird{
	public void cry(int num) { // 오버로딩
		System.out.println("참새 : 짹쨱");
	}

	public Sparrow() {
		super(); // 부모 클래스의 기본 생성자
	}

	public Sparrow(int wing) {
		super(wing);
	}
}