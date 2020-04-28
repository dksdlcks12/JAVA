package day8;

public class constructorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		Point p2 = new Point(1, 2);
		p1.prt();
		p2.prt();
	}

}
class Point{
	int x = 1;
	int y = 1;
	{
		x = 10;
		y = 10;
	}
	void prt() {
		System.out.printf("%4d%4d\n", x, y);
	}
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Point() {
		this(1,1);
	}
	public Point(Point p) {
		this(p.x, p.y); // this() 생성자를 사용할정우 메서드의 첫번째줄에 넣어주어야한다.
						// 아래 두 줄의 코드가 합쳐진 형태라 보면 된다.
		x = p.x;
		y = p.y;
		
	}
}