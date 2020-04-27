package day7;

import java.util.Scanner;

public class MethodEx3 {
	private static int[] randsetArr(int arr[], int min, int max) {
		int cont = 0;
		if(max<min) {
			int tmp = min;
			min=max;
			max=tmp;
		}
		while(cont<arr.length) {
			int in = 0;
			arr[cont] = (int)(Math.random()*(max-min+1)+min);
			while(in<cont) {
				if(arr[in]==arr[cont]) {
					break;
				}
				in++;				
			}
			if(in==cont) {
				cont++;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getnum = new Scanner(System.in);
		int leng = getnum.nextInt(), min = getnum.nextInt(), max = getnum.nextInt();
		int arr[]= new int[leng];
		randsetArr(arr, min, max);
		for(int prt : arr) {
			System.out.printf("%d ", prt);
		}
		System.out.println();
		getnum.close();
		System.exit(0);
	}

}
