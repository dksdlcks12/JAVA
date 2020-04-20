package day2;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		// 달(월)이 주어지면 해당하는 달의 마지막 일을 출력하는 코드를 switch문을 이용하여 작성
		Scanner getmonth = new Scanner(System.in);
		System.out.printf("1~12월 중 입력하여 주십시오. : ");
		int month = getmonth.nextInt();
		switch(month){
		case 2:
			System.out.printf("%d의 달의 마지막 날은 28일 입니다.", month);
			break;
		case 4: case 6: case 9: case 11:
			System.out.printf("%d의 달의 마지막 날은 30일 입니다.", month);
			break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.printf("%d의 달의 마지막 날은 31일 입니다.", month);
			break;
		default:
			System.out.printf("%d의 달은 존재하지 않습니다.", month);
		}
		getmonth.close();
	}

}
