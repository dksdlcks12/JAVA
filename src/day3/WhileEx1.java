package day3;

import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getmenu = new Scanner(System.in);
		int menu=0;
		while(menu!=4) {
			System.out.printf("1.메뉴1\n");
			System.out.printf("2.메뉴2\n");
			System.out.printf("3.메뉴3\n");
			System.out.printf("4.종료\n");
			System.out.printf("메뉴를 입력하여 주십시오. : ");
			menu = getmenu.nextInt();
		}
		getmenu.close();
		System.exit(0);
	}

}
