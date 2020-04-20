package day2;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getnum = new Scanner(System.in);
		System.out.printf("정수를 입력하여 주십시오. : ");
		int num = getnum.nextInt();
		if(num % 2 == 0) {
			System.out.printf("%d는 짝수 입니다.", num);
		}else{
			System.out.printf("%d는 홀수 입니다.", num);
		}
		getnum.close();
		
	}

}
