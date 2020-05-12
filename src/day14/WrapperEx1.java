package day14;

public class WrapperEx1 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		boolean b1 = true;
		Boolean b2 = true;
		char ch1 = 'a';// 리터럴 대입
		Character ch2 = 'a';// 인덱스 대입	// 오토박싱
		ch1 = ch2;	// 언박싱
		int num1 = 10;
		Integer num2 = 10;
		double dnum1 = 1.23;
		Double dnum2 = new Double(1.23);

	}

}
