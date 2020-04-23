package day5;

import day5_1.*;

public class ClassEx1 {
	public static void main(String[] args) {
		DefaultClassEx1.main(null);
		Point p1 = new Point();
		p1 = new Point(1,2);
		p1.x1 = 10;
		p1.y1 = 10;
	}

}
//point :  2차원 좌표평면에서 점 1개를 나타내는 클래스
class Point{
	int x1;
	int y1;
	public int x3;
	public int y3;	
	public Point() {
		x1 = x3 = 0;
		y1 = y3 = 0;
		System.out.printf("기본 생성자\n");
	}
	//생성자 오버로딩
	public Point(int x, int y) {
		x1 = x3 = x;
		y1 = y3 = y;
		System.out.printf("생성자 오버로딩\n");
	}
}
