package day8;

public class TestEx1 {

	public static void main(String[] args) { //1
		// TODO Auto-generated method stub
		int num1 = 1, num2 = 2; //2
		int res = sum2(num1,num2,3); //3 //9
		System.out.println(res);//10
	}//11
	
	public static int sum(int num1, int num2) {//6
		return num1+num2;//7
	}
	public static int sum2(int num1, int num2, int num3) {//4
		return sum(num1,num2)+num3;//5 //8
	}

}
