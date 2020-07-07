package day54;

import java.util.*;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=1; i<=10; i++) {
			arr.add(i);
		}
		for(int i:arr) {
			System.out.printf("%2d\n", i);
		}
	}

}
