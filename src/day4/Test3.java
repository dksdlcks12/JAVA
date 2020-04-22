package day4;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// 크기가 10인 배열을 선언하고 1~10까지 배열에 입력 짝수이면 *2하고 출력
		Scanner getnum = new Scanner(System.in);
		System.out.printf("배열 길이를 정하십시오. : ");
		int leng = getnum.nextInt();
		int arr[] = new int[leng];
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		for(int prt : arr) {
			System.out.printf("%4d", prt);
		}
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				arr[i]=arr[i]*2;
			}
		}
		for(int prt : arr) {
			System.out.printf("%4d", prt);
		}
		getnum.close();
		System.exit(0);
	}

}
