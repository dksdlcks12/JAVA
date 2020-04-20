package day2;

public class RandEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 0, max = 10;
		int random = (int)(Math.random()*(max-min+1))+min;
		int x = 0;
		for(;x<5; x++) {
			System.out.printf("%d\n", random);
			random = (int)(Math.random()*(max-min+1))+min;
		}
	}

}
