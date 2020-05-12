package day14;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		System.out.println("문자열을 입력하여 주십시오. : ");
		String str = get.nextLine();
		prt(str);
		System.out.println("처음 입력한 문자를 몇번 반복하여 출력하시겠습니까?");
		char ch = str.charAt(0);
		int num = get.nextInt();
		prt(ch, num);
		System.out.printf("%s", prt2(ch, num));
		get.close();
	}
	public static void prt(String s) {
		System.out.printf("%s\n", s);
	}
	public static void prt(char c, int num) {
		for(int i=0; i<num; i++) {
			System.out.printf("%2c", c);
		}
	}
	public static String prt2(char c, int num) {
		StringBuffer res = new StringBuffer(num);
		for(int i=0; i<num; i++) {
			res.append(c);
		}
		return res.toString();
	}
}
