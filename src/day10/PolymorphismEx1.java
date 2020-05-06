package day10;

public class PolymorphismEx1 {

	public static void main(String[] args) {
		Tv t = new Tv();
		CaptionTv ct = new CaptionTv();
		Tv t1 = new CaptionTv();
		//	CaptionTv ct1 = new Tv(); 하위클래스가 상위클래스를 참조할 수 없다
		t = ct;
		ct = (CaptionTv)t;	//	조상타입->자손타입은 조건부로 가능하다. 상황에 따라 ClassCastException이 발생한다
							//	부모객체가 부모클래스를 통해 생성된 객체가 아니라 자식 클래스를 참조하여 생성한 경우 가능
		ct.caption();
		SmartTv st = new SmartTv();
		ct = new CaptionTv();
		t = new Tv();
		Tv.display(st);
		Tv.display(ct);
		Tv.display(t);
	}

}
class Tv{
	boolean power = false;
	int ch;
	void power() {
		power = !power;
	}
	void chUp() {
		++ch;
	}
	void chDown() {
		--ch;
	}
	public static void display(Tv t) {
		if(t instanceof CaptionTv) {
			System.out.println("캡션TV");
		}else if(t instanceof SmartTv) {
			System.out.println("스마트TV");
		}
	}
}
class CaptionTv extends Tv {
	String text;
	void caption() {
		System.out.println("캡션 : " + text);
	}
}
class SmartTv extends Tv{
	String ip;
}