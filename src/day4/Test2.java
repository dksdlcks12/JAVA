package day4;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner get = new Scanner(System.in);
		System.out.printf("정수 2개를 입력하십시오. : ");
		int num1 = get.nextInt(), num2 = get.nextInt();
		System.out.print("+, -, *, /, % 중 하나를 입력하여 주십시오. : ");
		char ch1 = get.next().charAt(0);
		while (ch1!=43 && ch1!= 45 && ch1!=42 && ch1!=47 && ch1!=37) {
			System.out.print("+, -, *, /, % 중 하나를 입력하여 주십시오. : ");
			ch1 = get.next().charAt(0);
		}
		if(ch1==43) {
			System.out.printf("%d %c %d = %d", num1, ch1, num2, num1+num2);
		}else if(ch1==45) {
			System.out.printf("%d %c %d = %d", num1, ch1, num2, num1-num2);
		}else if(ch1==42) {
			System.out.printf("%d %c %d = %d", num1, ch1, num2, num1*num2);
		}else if(ch1==47) {
			System.out.printf("%d %c %d = %.2f", num1, ch1, num2, (double)num1/num2);
		}else {
			System.out.printf("%d %c %d = %d", num1, ch1, num2, num1%num2);
		}
		
		get.close();
		System.exit(0);
	}

}
