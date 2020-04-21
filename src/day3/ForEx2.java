package day3;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		// 정수 num이 소수인지 아닌지 판별하는 코드
		//num을 %으로 나누었을떄 1 이외의 숫자의 경우 0이 되면 안됨.
		Scanner getnum = new Scanner(System.in);
		System.out.printf("정수를 입력하여 주십시오. : ");
		int num = getnum.nextInt();
		getnum.close();
		if(num!=0 && num!=1) {
			for(int i=2; i<=num; i++) {
				if(i==num) {
					System.out.printf("%d는 소수 입니다.", num);
					break;
				}
				if(num%i == 0) {
					System.out.printf("%d는 %d의 배수로 소수가 아닙니다.", num, i);
					break;
				}
			}
		}else {
			System.out.printf("입력하신 숫자가 %d 이라서 소수를 판별 할 수 없습니다.", num);
		}
		System.exit(0);
	}
}
