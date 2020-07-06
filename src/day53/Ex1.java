package day53;
import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt(), num2 = scan.nextInt();
		System.out.printf("%d부터 %d까지의 합은 %d 입니다.", num1, num2, calc(num1, num2));
		scan.close();
	}
	public static int calc(int i, int j) {
		if(i>j) {
			int tmp = i;
			i = j;
			j = tmp;
		}
		int sum=0;
		for(;i<=j;i++) {
			sum+=i;
		}
		return sum;
	}
}
