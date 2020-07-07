package day53;
import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			double num1, num2;
			char op;
			System.out.print("두 정수와 연산자를 입력하세요 : (예: 1 2 +)");
			num1 = scan.nextDouble();
			num2 = scan.nextDouble();
			op = scan.next().charAt(0);
			System.out.printf("%.1f %c %.1f = %.1f\n",num1, op, num2, calc(num1,num2,op));
		}catch(ArithmeticException e) {
			System.out.printf("산술연산을 할 수 없는 경우 입니다.");
		}catch(InputMismatchException e) {
			System.out.printf("입력된 값은 연산 할 수 없습니다.");
		}catch(Exception e) {
			System.out.printf("산술연산기호가 아니라 연산을 할 수 없습니다.");
		}finally {
			scan.close();
		}
	}
	public static double calc(double num1, double num2, char op) throws Exception {
			switch(op) {
			case '+':	return num1 + num2;
			case '-':	return num1 - num2;
			case '*':	return num1 * num2;
			case '/':	return num1 / num2;
			case '%':	return num1 % num2;
			default:{
				throw new Exception();
			}
		}
	}
}
