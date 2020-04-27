package day7;

import java.util.Scanner;

public class MethodEx2 {
	private static boolean primeNum(int num) {
		if(num<2) {
			System.out.println("1이하라 소수를 판별 할 수 없습니다.");
			return false;
		}
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				System.out.printf("%d는 소수가 아닙니다.\n", num);
				return false;
			}
		}
		System.out.printf("%d는 소수입니다.\n", num);
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getnum = new Scanner(System.in);
		int num = getnum.nextInt();
		primeNum(num);
		getnum.close();
		System.exit(0);
	}

}
