package day5_1;

public class DefaultClassEx1 {
	public static void main(String[] args) {
		System.out.println("접근제한자 : public");
		DefaultClassEx2.main(null);
	}

}
//제한자가 Default이므로 같은 패키지나 같은 클래스에서 불러올 수 있다.
class DefaultClassEx2 {

	public static void main(String[] args) {
		System.out.println("접근제한자 : default");
	}
}