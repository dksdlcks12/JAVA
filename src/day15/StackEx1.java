package day15;

import java.util.*;

public class StackEx1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(new Integer(2));
		stack.push(Integer.parseInt("3"));
		for(Integer tmp : stack) {
			System.out.println(tmp);
		}
		System.out.println();
		System.out.println(stack.pop());
		System.out.println();
		for(Integer tmp : stack) {
			System.out.println(tmp);
		}
	}

}
