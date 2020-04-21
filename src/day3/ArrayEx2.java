package day3;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1[] = {10, 20, 30, 40, 50};
		int num2[] = new int[num1.length];
		System.out.println("num2 초기값");
		for(int i=0; i<num2.length; i++) {
			System.out.printf("%4d", num2[i]);
		}
		for(int i=0; i<num2.length; i++) {
			num2[i] = num1[i];
		}
		System.out.println();
		System.out.println("num1 배열");
		for(int i=0; i<num1.length; i++) {
			System.out.printf("%4d", num1[i]);
		}
		System.out.println();
		System.out.println("num2 배열");
		for(int i=0; i<num2.length; i++) {
			System.out.printf("%4d", num2[i]);
		}
		System.out.println();
		int num3[] = {10, 20, 30, 40, 50};
		int num4[] = new int[num3.length];
		System.out.println("num4 초기값");
		for(int i=0; i<num4.length; i++) {
			System.out.printf("%4d", num4[i]);
		}
		System.out.println();
		System.arraycopy(num3, 1, num4, 0, num4.length-1);
		System.out.println("num3의 배열");
		for(int i=0; i<num3.length; i++) {
			System.out.printf("%4d", num3[i]);
		}
		System.out.println();
		System.out.println("num4의 배열");
		for(int i=0; i<num4.length; i++) {
			System.out.printf("%4d", num4[i]);
		}
		System.exit(0);
	}

}
