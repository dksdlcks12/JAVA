package day2;

import java.util.Scanner;

public class ForEx4 {

	public static void main(String[] args) {
		// num가 주어지면 num의 약수를 출력하는 코드를 for로
		Scanner getnum = new Scanner(System.in);
		System.out.printf("정수를 입력하여 주십시오. : ");
		int i, num = getnum.nextInt();
		getnum.close();		

		if(num!=0) {
			System.out.printf("%d의 약수는 ", num);
			for(i=1; i<=num; i++){
				if(num%i==0) {
						System.out.printf("%d"+(i!=num?", ":""), i);
				}
			}
			System.out.printf(" 입니다.");
		}else {
			System.out.printf("0을 입력하셔서 약수를 출력할 수 없습니다.");
		}
	}

}
