package day14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx1 {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		String str = null;
		boolean chk = false;
		char gender='0';
		System.out.print("주민번호를 입력하십시오. : ");
		while(chk==false) {
			chk = true;
			str = get.nextLine();
			Pattern p = Pattern.compile("(\\d{6}-\\d{7})|(\\d{13})");
			Matcher m = p.matcher(str);
			if(!m.matches()||!isValid(str)){
				System.out.print("올바른 주민번호를 입력하십시오. : ");
				chk = false;
			}
		}
		if(str.contains("-")) {
			gender = str.charAt(7);
		}else {
			gender = str.charAt(6);
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
