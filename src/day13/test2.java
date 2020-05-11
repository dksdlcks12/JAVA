package day13;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		//연속적으로 정수를 입력 받다가 문자를 입력받는경우 예외처리
		Scanner get = new Scanner(System.in);
		try {	
			while(true) {
				@SuppressWarnings("unused")
				int num = get.nextInt();
			}
		} catch(Exception e){
			System.out.println("문자를 입력 하였습니다.");
			e.printStackTrace();
		}
		get.close();
	}

}
