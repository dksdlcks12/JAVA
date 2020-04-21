package day3;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		// num1 && num2 의 최소공배수(LCM)
		Scanner getnum = new Scanner(System.in);
		System.out.printf("정수 2개를 입력하십시오. : ");
		int cnt=0, lcm, num1 = getnum.nextInt(), num2 = getnum.nextInt();
		if(num1<num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		lcm=num1;
		if(0<num1 && 0<num2) {
			while(true) {
				cnt++;
				if(lcm%num1==0 && lcm%num2==0) {
					System.out.printf("%d번 반복 했으며 입력하신 %d와 %d의 최소공배수는 %d 입니다.", cnt, num1, num2, lcm);
					break;
				}
			lcm += num1;
			}
		}else {
			System.out.printf("%d와 %d중에 최소공배수를 구할 수 없는 숫자가 있습니다.", num1, num2);
		}
		getnum.close();
		System.exit(0);
	}

}
