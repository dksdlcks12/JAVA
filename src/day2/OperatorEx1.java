package day2;

public class OperatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10, num2 = 10;
		System.out.printf("증가전 : num1 = %d, num2 %d\n", num1, num2);
	    System.out.printf("증가중 : num1 = %d, num2 %d\n", ++num1, num2++);
	    System.out.printf("증가후 : num1 = %d, num2 %d\n", num1, num2);
	    //위 코드에서 참고하는 부분은 printf
//	    num1 = ++num1;
//	    num2 = num2++;
	    //위 코드에서 참조하는 부분은 대입연산자
//	    ++num1;
//	    num2++;
	    //위 코드에서 참조하는 부분은 없음
		System.out.printf("-------------------------\n증가전 : num1 = %d, num2 %d\n", num1, num2);
		++num1;
	    System.out.printf("증가중 : num1 = %d, num2 %d\n", num1, num2);
	    ++num2;
	    System.out.printf("증가후 : num1 = %d, num2 %d\n", num1, num2);
		System.out.printf("-------------------------\n증가전 : num1 = %d, num2 %d\n", num1, num2);
		num1++;
	    System.out.printf("증가중 : num1 = %d, num2 %d\n", num1, num2);
	    num2++;
	    System.out.printf("증가후 : num1 = %d, num2 %d\n", num1, num2);
	}

}
