package day14;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexEx2 {

	public static void main(String[] args) {
		// 입력받은 아이디가 유효한 아이디인지 판별
		// 첫글자가 알파벳으로 시작하는 5~10자의 영문,숫자 조합
		Scanner get = new Scanner(System.in);
		System.out.print("ID를 입력하십시오. : ");
		String id = get.next();
		Pattern p = Pattern.compile("[a-zA-Z]\\w{4,9}");
		if(p.matcher(id).matches()) {
			System.out.printf("%s는 유효한 아이디입니다.", id);
		}else {
			System.out.printf("%s는 유효하지 않은 아이디입니다.", id);
		}
		get.close();
	}

}
