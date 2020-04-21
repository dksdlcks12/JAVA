package day3;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getnum = new Scanner(System.in);
		int[] num = new int[5];
		System.out.printf("정수 5개를 입력하여 주십시오. : ");
		// 배열명.length -> 배열의 길이
		for(int i=0; i<num.length; i++) {
			num[i]=getnum.nextInt();
		}
		for(int i=0; i<num.length; i++) {
			System.out.printf(" %2d", num[i]);
		}
		getnum.close();
		System.exit(0);
	}
}
