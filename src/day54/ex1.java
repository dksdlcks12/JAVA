package day54;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point Pt = new Point();
		Pt.printpt();
		Pt.setX(5);
		Pt.setY(4);
		Pt.printpt();
		Point Pt2 = new Point(10,-10);
		Pt2.printpt();
		Pt2.setXY(20, -20);
		Pt2.printpt();
	}
}
class Point{
	private int x;
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void printpt() {
		System.out.printf("현재 좌표는 (%d,%d) 입니다.\n", x, y);
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point() {
		this.x = 0;
		this.y = 0;
	}
}