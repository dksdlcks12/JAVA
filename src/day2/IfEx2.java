package day2;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		// 변수 num을 선언하고 num의 초기값을 설정하여 num이 0이면 0이라고 출력하고, 그 이외의 경우 양수, 음수 판별
		Scanner getnum = new Scanner(System.in);
		System.out.printf("정수를 입력하여 주십시오. : ");
		int num = getnum.nextInt();
		if(num == 0) {
			System.out.printf("입력하신 숫자는 0 입니다.");
		}else if(0 < num) {
			System.out.printf("입력하신 숫자는 %d이고 양수 입니다.", num);
		}else {
			System.out.printf("입려가신 숫자는 %d이고 음수 입니다.", num);
		}
		getnum.close();
	}

}
