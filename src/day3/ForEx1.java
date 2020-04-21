package day3;

import java.util.Scanner;

public class ForEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getnum = new Scanner(System.in);
		System.out.printf("정수를 입력하여 주십시오 . : ");
		int num = getnum.nextInt();
		getnum.close();
		for(int i=1; i<=num; i++) {
			for(int j=0; j<i; j++) {
				System.out.printf("*");	
			}
			System.out.printf("\n");
		}
		System.exit(0);
	}

}