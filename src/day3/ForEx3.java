package day3;

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
		// num1와 num2의 최대공약수를 구하는 코드를 작성하시오 
		Scanner getnum = new Scanner(System.in);
		System.out.printf("정수 두개를 입력하여 주십시오. : ");
		int gcd=1, rep, num1 = getnum.nextInt(), num2 = getnum.nextInt();
		getnum.close();
		if(num1<=num2) {
			rep=num1;
		}else {
			rep=num2;
		}		
		for(int i=2; i<=rep; i++) {
			if(num1%i == 0 && num2%i == 0) {
				gcd = i;
			}
		}
		System.out.printf("%d와 %d의 최대 공약수는 %d입니다.", num1, num2, gcd);
		System.exit(0);
	}
}