package day3;

public class ForEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				continue;
			}
			System.out.printf("%4d\n", i);
		}
		System.exit(0);
	}

}
