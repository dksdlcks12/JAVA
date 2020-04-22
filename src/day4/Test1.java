package day4;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// 두 정수와 문자하나를 입력받아 출력하는 코드
		Scanner get = new Scanner(System.in);
		System.out.printf("정수 2개를 입력하십시오. : ");
		int num1 = get.nextInt(), num2 = get.nextInt();
		System.out.printf("문자를 입력하여 주십시오. : ");
		String ch1 = get.next();
		
		
		System.out.printf("%4d   %s%4d", num1, ch1, num2);
		get.close();
		System.exit(0);
	}

}
