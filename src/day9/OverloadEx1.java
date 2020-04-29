package day9;

public class OverloadEx1 {
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	public static double sum(double num1, double num2) {
		return num1+num2;
	}
	public static double sum(double num1, double num2, double num3) {
		return num1+num2+num3;
	}
	// 가변인자는 배열
	public static double sum(double... nums) {
		double res = 0;
		for(double tmp : nums) {
			res += tmp;
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.printf("%d\n", sum(1, 2));
		System.out.printf("%.2f\n", sum(1.1, 2.1));
		System.out.printf("%.2f\n", sum(1.1, 2.1,3.25));
		System.out.printf("%.2f\n", sum(1,3,4,5,2,123.3424,123,4,3,1));
		
	}

}
