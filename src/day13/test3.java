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
		str = get.next();
		if(str.charAt(7)%2==1) {
			System.out.println("남성입니다.");
		}else {
			System.out.println("여성입니다.");
		}
		get.close();
	}

}
