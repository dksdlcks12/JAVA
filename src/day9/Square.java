package day9;

public class Square extends Shape {
	private static int contSq;
	public void prt() {
		System.out.printf("---------------사각형의 정보--------------\n");
		System.out.printf("시작점(%d, %d)\n", getLeft(), getUp());
		System.out.printf("가로 : %.2f\n", getWidth());
		System.out.printf("세로 : %.2f\n", getHeight());
		System.out.printf("--------------------------------------\n");
	}
	public Square() {
		contSq++;
	}
	public Square(int left, int up, double width, double height) {
		super(left,up,width,height);	//	부모 생성자 호출 : 자식 클래스의 생성자에서만 호출할 수 있다.
		contSq++;
	}
	public static void viewcont() {
		System.out.printf("%d개의 사각형을 만들었습니다.\n", Square.getContSq());
		System.out.printf("--------------------------------------\n");
	}
	public static int getContSq() {
		return contSq;
	}
	
}
