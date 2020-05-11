package day13;

import java.util.Scanner;

public class Homework1 {
	static Scanner get = new Scanner(System.in);
	public static void main(String[] args) {
		game();
		get.close();
	}
	public static int rand(int min, int max) {
		if(max<min) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		return (int)(Math.random()*(max-min+1)+min);
	}
	public static void game() {
		System.out.print("난수의 범위를 설정하여 주십시오.");
		int min = get.nextInt(), max = get.nextInt();
		int rand = rand(min,max);
		System.out.print("생성된 난수를 예상하십시오 : ");
		int num = get.nextInt();
		while(num != rand) {
			if(rand<num) {
				System.out.println("down");
				System.out.print("생성된 난수를 예상하십시오 : ");
				num = get.nextInt();
			}
			if(num<rand) {
				System.out.println("up");
				System.out.print("생성된 난수를 예상하십시오 : ");
				num = get.nextInt();
			}
		}
		System.out.println("hit");
	}
}
