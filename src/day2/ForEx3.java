package day2;

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getnum = new Scanner(System.in);
		System.out.printf("정수를 입력하여 주십시오. : ");
		int i, sum = 0, num = getnum.nextInt();
		getnum.close();
		for(i=0; i<num; i++) {
			sum = sum+i+1;
			System.out.printf("1부터 %d까지의 더한 값은 %d 입니다.\n", i+1, sum);
		}
	}
}
