package day8;

public class RecursiveEx1 {

	public static void main(String[] args) { //1
		// TODO Auto-generated method stub
		System.out.println(factorial(5)); //2 17
	} //18
	
	static int factorial(int num) { //3 5 7 9 11
		if(num==1 || num==0) {
			return 1; //12
		}
		if(num<0) {
			return 0;
		}
		return num*factorial(num-1); //4 6 8 10 13 14 15 16
	}
}
