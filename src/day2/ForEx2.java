package day2;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getnum = new Scanner(System.in);
		System.out.printf("정수를 입력하여 주십시오. : ");
		int i, num = getnum.nextInt();
		getnum.close();
		for(i=0;i<9;i++) {
			System.out.printf("%d X %d = %d", num, i+1, num*(i+1));
		}
	}
}
