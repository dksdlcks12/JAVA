package day2;

public class OperatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1/2);
		System.out.println(1.0/2);
		int num1 = 1, num2 = 2;
		System.out.println((double)num1/num2);
		System.out.println(3/0.0);
		
		char c1 = 'A';
		char c2 = 'A'+1;
		System.out.printf("%c\n", c2);
		char c3 = (char)(c1+1);
		System.out.printf("%c", c3);
	}

}
