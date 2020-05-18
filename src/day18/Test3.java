package day18;

import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		int arr[]=new int[0];
		try {
			int num = get.nextInt();
			arr = new int[num];
			for(int i=0; i<arr.length; i++) {
				arr[i]=get.nextInt();
			}
		}catch (Exception e) {
			System.out.println("입력된 값이 정수가 아니라 입력을 종료합니다.");
		}
		for(int i=arr.length; 0<i; i--) {
			System.out.printf("%4d", arr[i-1]);
		}
		get.close();
	}

}
