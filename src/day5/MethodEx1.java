package day5;

public class MethodEx1 {
	/* 기능 : 두 정수의 합을 알려주는 메서드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : int
	 * 메서드명 : sum
	 */
	public static int sum(int num1, int num2) {
		return num1+num2;//메서드를 종료하고 값을 전달
	}
	public static int gcd(int num1, int num2) {

		int res=1, rep;
		if(num1<=num2) {
			rep=num1;
		}else {
			rep=num2;
		}		
		for(int i=2; i<=rep; i++) {
			if(num1%i == 0 && num2%i == 0) {
				res = i;
			}
		}
		return res;
		
	}
 	public static void gcd2(int num1, int num2) {

		int res=1, rep;
		if(num1<=num2) {
			rep=num1;
		}else {
			rep=num2;
		}		
		for(int i=2; i<=rep; i++) {
			if(num1%i == 0 && num2%i == 0) {
				res = i;
			}
		}
		System.out.printf("%d와 %d의 최대 공약수는 %d입니다.", num1, num2, res);		
	}
	public static int lcm(int num1, int num2) {
		return num1*num2/gcd(num1,num2);
	}
	/* 기능 : 정수가 소수인지 아닌지 판별하는 메소드
	 * 매개변수 : num
	 * 리턴타입 : boolean
	 * 메소드명 : isPrime
	 */
	public static boolean isPrime(int num) {
		for(int i=2; i<num; i++) {
			if(num%i==0) {
			return false;	
			}
		}
        return true;
	}
			
 	
	
	public static void main(String[] args) {
		int n1=3, n2=25, sum=sum(n1,n2);
		char sum1=(char)sum(n1,n2);
		System.out.printf("%4d %4d %4c", sum, (int)sum1, sum1);
		System.out.printf("\n%4d\n", gcd(n1,n2));
		gcd2(n1,n2);
		System.out.printf("\n%4d", lcm(n1,n2));
		System.out.printf("\n%b",isPrime(n1));
		System.out.printf("\n%b",isPrime(n2));
	}
    
}
