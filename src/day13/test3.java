package day13;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		String str = get.nextLine();
		if(str.contains("java")) {
			System.out.println("java라는 단어가 있습니다.");
		}else {
			System.out.println("java라는 단어가 없습니다.");
		}
		if(str.contains("Java")) {
			System.out.println("Java라는 단어가 있습니다.");
		}else {
			System.out.println("Java라는 단어가 없습니다.");
		}
		boolean chk = false;
		int gender='0';
		System.out.print("주민번호를 입력하십시오. : ");
		while(chk==false) {
			chk = true;
			str = get.nextLine();
			str = str.replaceAll(" ", "");
			if(isValid(str)==true) {
				for(int i=0; i<str.length(); i++) {
					if(str.length()==13) {
						if(str.charAt(i)<48 || 57<str.charAt(i)) {
							chk = false;
						}
						gender = str.charAt(6);
					}else if(str.length()==14) {
						if(i!=6 && (str.charAt(i)<48 || 57<str.charAt(i))) {
							chk = false;
						}
						gender = str.charAt(7);
					}else {
						chk = false;
					}
				}
			}else {
				chk = false;
			}
			if(chk==false) {
				System.out.print("주민번호형식이 아닙니다 다시 입력하여 주십시오 : ");
			}
		}
		if(gender%2==1) {
			System.out.println("남성입니다.");
		}else {
			System.out.println("여성입니다.");
		}
		get.close();
	}
	public static boolean isValid(String birth) {
		if(birth == null || birth.length()<6) {
			return false;
		}
		String sYear, sMonth, sDay;
		try {
			sYear = birth.substring(0, 2);
			sMonth = birth.substring(2, 4);
			sDay = birth.substring(4, 6);
		}catch(Exception e) {
			return false;
		}
		@SuppressWarnings("unused")
		int year = Integer.parseInt(sYear);
		int month = Integer.parseInt(sMonth);
		int day = Integer.parseInt(sDay);
		int lastday;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			lastday = 31;
			break;
		case 4: case 6: case 9: case 11:
			lastday = 30;
			break;
		case 2:
			lastday = 28;
			break;
		default:
			return false;
		}
		if(day<1 || lastday<day) {
			return false;
		}
		return true;
	}
}
