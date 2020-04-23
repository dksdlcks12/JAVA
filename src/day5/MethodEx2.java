package day5;

import java.util.Scanner;

public class MethodEx2 {
	// 기능 : 두 정수와 산술연산자가 주어지면 연산 결과를 알려주는 알려주는 메서드
	public static double alg(int num1, int num2, char code) {
		if(code=='+') {
			return num1+num2;
		}else if(code=='-') {
			return num1-num2;
		}else if(code=='/' && num1!=0 && num2!=0) {
			return (double)num1/num2;
		}else if(code=='%') {
			return num1%num2;
		}else if(code=='*') {
			return num1*num2;
		}else {
			System.out.printf("오류가 발생 하여 0을 리턴합니다.\n");
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner get = new Scanner(System.in);
		System.out.printf("정수2개와 연산기호 1개를 입력하십시오. : ");
		int num1=get.nextInt(), num2=get.nextInt();
		char code=get.next().charAt(0);
		System.out.printf("%d %c %d = %.2f", num1, code, num2, alg(num1,num2,code));
		get.close();
		System.exit(0);
	}
}
