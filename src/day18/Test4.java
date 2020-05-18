package day18;

import java.util.*;

public class Test4 {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		int num = get.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		while(num!=0 || list.size()==0) {
			list.add(num%10);
			num = num/10;
			;
		}
		for(Integer tmp:list) {
			System.out.printf("%2d", tmp);
		}
		get.close();
	}
}
