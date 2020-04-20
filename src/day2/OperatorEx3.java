package day2;

import java.util.Scanner;

public class OperatorEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getscore = new Scanner(System.in);
		System.out.printf("당신의 점수를 입력하십시오. : ");
		int score = getscore.nextInt();
		while(score<0 || 100<score) {
			System.out.printf("오류가 발생 하였습니다. 점수를 다시 입력하여 주십시오. : ");
			score = getscore.nextInt();
		}
		if(90<=score && score<=100) {
			System.out.printf("당신의 점수는 %d점 이므로 학점은 A입니다.\n", score);
		}
		if(80<=score && score<90) {
			System.out.printf("당신의 점수는 %d점 이므로 학점은 B입니다.\n", score);
		}
		if(70<=score && score<80) {
			System.out.printf("당신의 점수는 %d점 이므로 학점은 C입니다.\n", score);
		}
		if(60<=score && score<70) {
			System.out.printf("당신의 점수는 %d점 이므로 학점은 D입니다.\n", score);
		}
		if(50<=score && score<60) {
			System.out.printf("당신의 점수는 %d점 이므로 학점은 E입니다.\n", score);
		}
		if(0<=score && score<50) {
			System.out.printf("당신의 점수는 %d점 이므로 학점은 F입니다.\n", score);
		}
		getscore.close();

	}

}
