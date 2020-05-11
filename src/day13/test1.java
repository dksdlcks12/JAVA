package day13;

import java.util.Scanner;

public class test1 {


	public static void main(String[] args) {
		//반복문을 통해 문자를 입력 받고 입력 받은 문자가 1이면 1 입니다라는 예외는 발생시키는 코드를 작성
		Scanner get = new Scanner(System.in);
		try {
			while(true) {
				char ch = get.next().charAt(0);
				if(ch=='1') {
					get.close();
					throw new Exception(ch+"이(가) 입력되어 예외처리를 합니다.");
				}
			}

		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
