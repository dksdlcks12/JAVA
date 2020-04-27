package day7;

import java.util.Scanner;

public class MethodEx1 {
	private static void multipliePrt (int num) {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d X %d = %d\n", num, i, num*i);
		}
	}
	private static int multipliePrt (int num, int start, int end) {
		if(num<=0) {
			System.out.printf("0단이라 출력할 수 없음.\n");
			return 0;
		}
		if(end<start) {
			System.out.printf("start가 end보다 작음\n");
			return -1;
		}
		for(int i=start; i<=end; i++) {
			System.out.printf("%d X %d = %d\n", num, i, num*i);
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getnum = new Scanner(System.in);
		int num = getnum.nextInt(), start = getnum.nextInt(), end = getnum.nextInt();
		multipliePrt(num);
		System.out.println("--------------------");
		while(multipliePrt(num, start, end)!=1){
			num = getnum.nextInt(); 
			start = getnum.nextInt();
			end = getnum.nextInt();
		}
		
		getnum.close();
		System.exit(0);
	}
}
