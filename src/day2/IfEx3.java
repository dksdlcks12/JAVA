package day2;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 정수 num을 선언하고 num 값을 초기화, num가 2의 배수이면 2의 배수, 3의 배수면 3의 배수, 6의 배수이면 6의 배수
		   그 이외는 2, 3, 6의 배수가 아니라 출력*/
		Scanner getnum = new Scanner(System.in);
		System.out.printf("정수를 입력하여 주십시오 . : ");
		int num = getnum.nextInt();
				
		if(num%6==0 && 0<num/6) {
			System.out.printf("입력하신 값은 %d이고 6의 배수 입니다", num);
		}else if(num%2==0 && 0<num/2) {
			System.out.printf("입력하신 값은 %d이고 2의 배수 입니다.", num);
		}else if(num%3 == 0 && 0<num/3) {
			System.out.printf("입력하신 값은 %d이고 3의 배수 입니다.", num);
		}else {
			System.out.printf("입력하신 값은 %d이고 2, 3, 6의 배수가 아닙니다.", num);
		}
		getnum.close();
		
		if(num%2==0 && 0<num/2) {
			if(num%3==0 && 0<num/3) {
				System.out.printf("입력하신 값은 %d이고 6의 배수 입니다.", num);
			}else {
				System.out.printf("입력하신 값은 %d이고 2의 배수 입니다.", num);
			}
		}else if(num%3 == 0 && 0<num/3) {
			System.out.printf("입력하신 값은 %d이고 3의 배수 입니다.", num);
		}else{
			System.out.printf("입력하신 값은 %d이고 2, 3, 6의 배수가 아닙니다.", num);
		}
		getnum.close();
	}

}
