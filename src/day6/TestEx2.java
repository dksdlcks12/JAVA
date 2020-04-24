package day6;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getnum = new Scanner(System.in);
		for(; ;) {
			System.out.print("점수를 입력하십시오.(종료하려면 음수를 입력하시오.) : ");
			int score = getnum.nextInt();
			if(100<score) {
				System.out.printf("입력된 숫자는 점수로 인정되지 않습니다.\n");
			}else if(90<=score && score<=100) {
				System.out.printf("%4d점 A\n", score);
			}else if(80<=score && score<90) {
				System.out.printf("%4d점 B\n", score);
			}else if(70<=score && score<80) {
				System.out.printf("%4d점 C\n", score);
			}else if(60<=score && score<70) {
				System.out.printf("%4d점 D\n", score);
			}else if(0<=score && score<60) {
				System.out.printf("%4d점 F\n", score);
			}else {
				System.out.printf("%4d가 음수라서 종료합니다.", score);
				break;
			}
		}
		
		getnum.close();
		System.exit(0);
	}

}
