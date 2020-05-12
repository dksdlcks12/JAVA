package day14;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r1 = Math.random();
		System.out.println(r1);
		double r2 = new Random().nextDouble();
		System.out.println(r2);
		int max = 10, min = 1;
		int rand1 = (int)(Math.random()*(max-min+1)+min);
		System.out.println(rand1);
		int rand2 = new Random().nextInt(max-min)+min;
		System.out.println(rand2);
	}

}
