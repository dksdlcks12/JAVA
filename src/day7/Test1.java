package day7;

import java.util.Scanner;

public class Test1 {
	private static void prtArr(int arr[]) {
		for(int prt : arr) {
			System.out.printf("%d ", prt);
		}
		System.out.println();
	}
	private static boolean checkArr(int arr[], int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	}
	private static int[] randsetArr(int arr[], int min, int max) {
		int rand=0;
		if(max<min) {
			int tmp = min;
			min=max;
			max=tmp;
		}
		if(max-min+1<arr.length) {
			System.out.printf("난수의 범위가 배열의 크기보다 작습니다.\n");
			return arr;
		}
		for(int i=0; i<arr.length; i++) {
			rand=(int)(Math.random()*(max-min+1)+min);
			while(checkArr(arr, rand)) {
				rand=(int)(Math.random()*(max-min+1)+min);
			}
			arr[i]=rand;
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getnum = new Scanner(System.in);
		int leng = getnum.nextInt(), min = getnum.nextInt(), max = getnum.nextInt();
		int arr[] = new int [leng];
		randsetArr(arr, min, max);
		prtArr(arr);
		getnum.close();
		System.exit(0);
	}

}
