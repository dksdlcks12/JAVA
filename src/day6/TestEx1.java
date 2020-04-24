package day6;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getch = new Scanner(System.in);
		char ch;
		for(int i=0; i<5; i++) {
			System.out.print("문자를 입력하십시오. : ");
			ch = getch.next().charAt(0);
			if(ch == 'q') {
				System.out.printf("%c를 입력해서 종료합니다.\n", ch);
				break;
			}else{
				System.out.printf("%c\n", ch);
			}
		}
		getch.close();
		System.exit(0);
	}

}
