package day13;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try {
			int arr[] = new int[4];
			arr[4] =10;
		}catch(ArithmeticException e/*예외클래스1 e*/) {
			System.out.println("0으로 나눌 수 없습니다.");//예외처리
		}catch(IndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 관련 예외 발생");
		}catch(Exception e) {
			System.out.println("예외 발생");
		}
	}

}
