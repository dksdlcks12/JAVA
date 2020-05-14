package day16;

import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		randSet(list);
		System.out.print(list);
	}
	public static void randSet(List<Integer> list) {
		int min = 1, max = 10;
		while(list.size()<6) {
			int rand = new Random().nextInt(max-min+1)+min;
			if(!list.contains(rand)) {
				list.add(rand);
			}
		}
	}
}
