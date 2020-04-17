package day1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.printf("정수를 입력하십시오 : ");
		int getnum1 = scan.nextInt();
		System.out.printf("입력하신 정수는 %d입니다.\n", getnum1);
		double x = getnum1;
		System.out.printf("정수를 실수로 변형시키면 %.2f가 됩니다.\n\n", x);
		
		System.out.printf("실수를 입력하십시오 : ");
		double getnum2 = scan.nextDouble();
		System.out.printf("입력하신 실수는 %f입니다.\n", getnum2);
		int y = (int)getnum2;
		System.out.printf("실수를 정수로 변환시키면 %d가 됩니다.", y);
		
		scan.close();
	}

}
