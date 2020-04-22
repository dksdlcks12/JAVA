package day4;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 난수 배열 만들기
		Scanner getnum = new Scanner(System.in);
		System.out.printf("정수를 입력하십시오. : ");
		int leng = getnum.nextInt();
		int num[] = new int[leng], cont=0;
		int num2[] = new int[leng];
		boolean comp;
		//for로 만든 경우
		for(int i=0; i<num.length; i++) {
			while(true) {
				num[i]=(int)(Math.random()*leng+1);
				comp=false;
				for(int j=0; j<i; j++) {
					if(num[i]==num[j]) {
						num[i]=(int)(Math.random()*leng+1);
						comp=true;
						break;
					} else {
						comp=false;
					}
				}
				if(!comp) {
					break;
				}
			}
		}
		for(int tmp : num) {
			System.out.printf("%4d", tmp);
		}
		System.out.println();
		//while로 만든 경우
		while(cont<num2.length) {
			num2[cont] = (int)(Math.random()*leng+1);
			int in=0;
			while(in<cont) {
				if(num2[in]==num2[cont]) {
					num2[cont] = (int)(Math.random()*leng+1);
					break;
				}
				in++;				
			}
			if(in==cont){
				cont++;
			}
		}
		for(int tmp : num2) {
			System.out.printf("%4d", tmp);
		}
		getnum.close();
		System.exit(0);
	}
}
