package day8;

public class OverLoadEx1 {

	public static void main(String[] args) { //
		// TODO Auto-generated method stub
		System.out.println(5);		//public void println(int x)
		System.out.println('5');	//public void println(char x)
		System.out.println("5");	//public void println(String x)
		System.out.println(5.0f);	//public void println(float x)
		System.out.println(5.0);	//public void println(double x)
		System.out.println(false);	//public void println(boolean x)
		System.out.println(5L);		//public void println(long x)
		printString();
		printString("홍길동");
		printString("홍길동","임꺽정");
		printString("홍길동","임꺽정","이순신");
	}
	public static void printString(String...str) { // 배열과 가변인자(...)의 차이는 매개변수가 없을경우 가변인자는 작동하고 배열은 작동하지 않는다.
		for(String tmp : str) {
			System.out.print(tmp+" ");
		}
		System.out.println();
	}
}
