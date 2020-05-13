package day15;

import java.util.*;

public class QueueEx1 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		for(Integer tmp : q) {
			System.out.println(tmp);
		}
		System.out.println();
		System.out.println(q.poll());
		System.out.println();
		for(Integer tmp : q) {
			System.out.println(tmp);
		}	
	}

}
