package day18;

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		prtPn(get);
		get.nextLine();
		prtNEO(get);
		get.close();
	}
	public static void prtPn(Scanner get) {
		try {
			System.out.print("소수를 판별할 정수를 입력하십시오. : ");
			int num1 = get.nextInt();
			if(primeNum(num1)) {
				System.out.printf("%d는 소수 입니다.", num1);
			}else {
				System.out.printf("%d는 소수가 아닙니다.", num1);
			}
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println("입력된 값은 판별할 수 없습니다.");
		}
	}
	public static void prtNEO(Scanner get) {
		try {
			System.out.println("서로소를 판별할 정수 2개를 입력하십시오. : ");
			int num1 = get.nextInt(), num2 = get.nextInt();
			if(numEachOther(num1, num2)) {
				System.out.printf("%d와 %d는 서로소 입니다.\n", num1, num2);
			}else {
				System.out.printf("%d와 %d는 서로소가 아닙니다.\n", num1, num2);
			}
		}catch(ArithmeticException e) { 
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("입력된 값은 판별할 수 없습니다.");
		}
	}
	public static boolean primeNum(int num) {
		if(num<1) {
			throw new ArithmeticException("음수라 판별할 수 없습니다.");
		}
		if(num==1) {
			throw new ArithmeticException("1이라 판별할 수 없습니다.");
		}
		int comp=2;
		while(num!=comp){
			if(num%comp==0) {
				return false;
			}
			comp++;
		}
		return true;
	}
	public static boolean numEachOther(int num1, int num2) {
		if((num1<1 || num2<1)) {
			throw new ArithmeticException("음수가 있어서 판별할 수 없습니다.");
		}
		if(num1==num2) {
			throw new ArithmeticException("두 수가 같아서 판별할 수 없습니다.");
		}
		if(num1==1 || num2==1) {
			return true	;
		}
		int comp=2;
		int min;
		if(num1<num2) {
			min=num1;
		}else {
			min=num2;
		}
		while(min+1!=comp) {
			if(num1%comp==0 && num2%comp==0) {
				return false;
			}
			comp++;
		}
		return true;
	}
}
