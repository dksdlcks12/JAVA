package day1;

import java.util.Scanner;

public class ExVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		System.out.println(7+7);
		System.out.println(" "+7+7);
		System.out.println(7+7+" ");
		System.out.println();
		System.out.print("안녕\n");
		//System.out.print(); -> 에러
		System.out.println(" "+(7+7));
		  
		int num1 = 10;
		int num2 = 20;
		  
		System.out.printf("%2d,%2d\n", num1, num2);
		    
		num1 = 9;
		num2 = 11;
		    
		System.out.printf("%2d,%2d\n", num1, num2);
		    
		double dnum = 1.23;
		    
		System.out.println(dnum);
		System.out.printf("%f\n", dnum);
		System.out.printf("%.4f\n", dnum);
		System.out.printf("%7.4f\n", dnum);
		System.out.printf("%-7.4f", dnum);
		System.out.printf("%7.4f\n", dnum);
		System.out.println();

		Scanner scan = new Scanner(System.in);
		    
		System.out.printf("정수를 입력하십시오 : ");
		int num = scan.nextInt();
		System.out.printf("입력한 정수는 %d입니다.\n", num);
		    
		System.out.printf("문자를 입력하여 주십시오 : ");
		char ch = scan.next().charAt(0);
		System.out.printf("처음 입력한 문자는 %c 입니다\n", ch);
		String str = new String();
		System.out.printf("문자열을 입력하여 주십시오\n");
		str = scan.next();
		System.out.printf("입력한 문자열은 " + str + " 입니다.");
		
		scan.close();
	}

} 
