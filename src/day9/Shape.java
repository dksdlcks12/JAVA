package day9;

public class Shape{
	private int left;	//	시작점의 x좌표
	private int up;		//	시작점의 y좌표
	private double width;	// 가로의 길이
	private double height;	// 세로의 길이
	private static int cont;
	public void prt() {
		System.out.printf("---------------도형의 정보---------------\n");
		System.out.printf("시작점(%d, %d)\n", left, up);
		System.out.printf("가로 : %.2f\n", width);
		System.out.printf("세로 : %.2f\n", height);
		System.out.printf("--------------------------------------\n");
	}
	public Shape() {
		cont++;
	}
	public Shape(int left, int up, double width, double height) {
		this.left = left;
		this.up = up;
		this.width = width;
		this.height = height;
		cont++;
	}
	public void move(int left, int up) {
		this.left = left;
		this.up = up;
	}
	public void resize(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public static void viewcont() {
		System.out.printf("%d개의 도형을 만들었습니다.\n", cont);
		System.out.printf("%d개의 원을 만들었습니다.\n", Circle.getContCir());
		System.out.printf("%d개의 사각형을 만들었습니다.\n", Square.getContSq());
		System.out.printf("--------------------------------------\n");
	}
 	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getUp() {
		return up;
	}
	public void setUp(int up) {
		this.up = up;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

}
