package day5;
/* 클래스명 : Point1
 * 맴버변수 : x좌표, y좌표 => 외부에서 접근이 불가능하도록
 * 기능(메서드)
 *  - 현재 좌표를 출력하는 기능
 *  - x,y좌표가 주어지면 해당좌표로 이동하는 기능
 *  - x의 값이 주어지면 x1의 값을 수정하는 기능
 *  - y의 값이 주어지면 y1의 값을 수정하는 기능
 *  - x1의 값을 가져오는 기능
 *  - y1의 값을 가져오는 기능
 * 생성자
 *  - 기본 생성자
 *  - x,y좌표가 주어졌을때 객체를 생성하는 생성자
 */
class Point1{
	private int x, y;
	private static int cont;
	public void prt(){
		System.out.printf("(%d, %d)\n", x, y);
	}
	public void go(int goX, int goY) {
		x=goX;
		y=goY;
	}
	//getter && setter
	//getter은 맴버변수가 private인 경우 직접 멤버변수 값을 가져올 수 없기 때문에 접근 가능하게 하는 메서드
	//setter은 멤버변수가 private인 경우 직접 멤버변수 값을 설정할 수 없기 때문에 설정 가능하게 하는 메서드 
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
	//생성자가 하나도 없으면 기본 생성자를 생략가능하지만 생성자 오버로딩이 되어있는 상태에서는 에러발생
	public Point1() {
		cont++;
	}	
	public Point1(int x,int y) {
		this.x=x;
		this.y=y;
		cont++;
	}
	public static int getCont() {
		return cont;
	}
	public static void setCont(int cont) {
		Point1.cont = cont;
	}
	public static void prtcont() {
		System.out.printf("지금까지 만들어진 좌표의 갯수 : %d\n", cont);
	}
}
public class ClassEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point1 p1 = new Point1();
		p1.prt();
		p1.go(5, 7);
		Point1.prtcont();
		Point1 p2 = new Point1(3,5);
		p2.prt();
		Point1.prtcont();
	}

}