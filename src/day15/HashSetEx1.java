package day15;

import java.util.*;

public class HashSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		int size = 3, min = 1, max = 9;
		while(hs.size()<size) {
			hs.add(new Random().nextInt(max-min) + min);
		}
		for(Integer tmp : hs) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		HashSet<Num3> hs2 = new HashSet<Num3>();
		hs2.add(new Num3(1));
		hs2.add(new Num3(1));
		hs2.add(new Num3(3));
		for(Num3 tmp : hs2) {
			System.out.print(tmp + " ");
		}
	}

}
class Num3{
	int num;
	public Num3() {
		
	}
	public Num3(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Num3 [num=" + num + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Num3 other = (Num3) obj;
		if (num != other.num)
			return false;
		return true;
	}
	
}