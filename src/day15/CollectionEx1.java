package day15;

import java.util.*;

public class CollectionEx1 {

	public static void main(String[] args) {
		//ArrayList<a> -> 클래스 a의 객체만 저장할 수 있다. 
		ArrayList<Num> list = new ArrayList<Num>();
		list.add(new Num());
		//자동 형변환이라 가능
		//명시적 형변환 같은 경우 런타임 에러가 발생 할 가능성이 있음.
		list.add(new Num(1));
		list.add(new Num(1));
		list.add(new Num(1));
		list.add(new Num(1));
		list.add(new Num(2));
		list.add(new Num(4));
		printList(list);
		list.remove(new Num());
		System.out.println();
		printList(list);
		System.out.println();
		ArrayList<Num> list2 = new ArrayList<Num>(list);
		printList(list2);
		System.out.println();
		list.add(1, new Num(200));
		printList(list);
		System.out.println();
		list2.clear();
		printList(list2);
		System.out.println();
		list2.add(new Num(1));
		list.removeAll(list2);
		printList(list);
		System.out.println();
		list2.addAll(list);
		printList(list2);
		System.out.println();
		Iterator<Num> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		List<Num> list3 = list.subList(0, 2);
		printList(list3);
		System.out.println();
		list.sort(new Comparator<Num>() {

			@Override
			public int compare(Num o1, Num o2) {
				if(o1.num>o2.num)
					return 1;
				if(o1.num<o2.num)
					return -1;
				return 0;
			}
		});
		printList(list);
		System.out.println();
	}

	private static void printList(List<Num> list) {
		for(Num tmp : list) {
			System.out.print(tmp);
		}
	}

}
class Num{
	int num;

	@Override
	public String toString() {
		return "Num [num=" + num + "] ";
	}
	public Num() {
		
	}
	public Num(int num) {
		this.num = num;
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
		Num other = (Num) obj;
		if (num != other.num)
			return false;
		return true;
	}
	
}
class Num2 extends Num{
	
}
class Ch{
	char ch;

	@Override
	public String toString() {
		return "Ch [ch=" + ch + "]";
	}
	
}