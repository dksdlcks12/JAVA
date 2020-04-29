package day9;

public class RecursiveEx3 {
	static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClB b = new ClB();
		b.print();
		System.out.println(sum(1));
		System.out.println(sum(100,0));
		System.out.println(sum2(1));
		System.out.println(sum2(100,0));
		System.out.println(i);
	}
	public static int sum(int num) {	//	num부터 0까지의 합 구하기
		if(0<=num) {
			if(num==1) {
				return 1;
			}
			return num+sum(num-1);
		}else if(num==0) {
			return 0;
		}else {
			if(num==-1) {
				return -1;
			}
			return num+sum(num+1);
		}
	}
	public static int sum(int min, int max) {	// max부터 min까지의 합 구하기
		if(max<min) {
			System.out.println("최솟값이 최댓값보다 커서 서로 바꿔서 계산합니다.");
			int tmp = min;
			min = max;
			max = tmp;
		}
		if(min==max) {
			return min;
		}
		return max + sum(min, max-1);
	}
	public static int sum2(int num) {	//	sum을 0부터 num까지로 바꾸어서 할 경우
		if(0<num) {
			i++;
			if(num<i) {
				i=0;
				return 0;
			}
			return i+sum2(num);
		}else if(num==0) {
			return 0;
		}else {
			i--;
			if(i<num) {
				i=0;
				return 0;
			}
			return i+sum2(num);
		}
	}
	public static int sum2(int min, int max) {	//	sum을 min부터 max로 바꾸어서 할 경우
		if(max<min) {
			System.out.println("최솟값이 최댓값보다 커서 서로 바꿔서 계산합니다.");
			int tmp = min;
			min = max;
			max = tmp;
		}
		if(min==max) {
			return max;
		}
		return min + sum2(min+1, max);
	}
}
class ClA {
	public void print() {
		System.out.println("A클래스 입니다.");
	}
}
class ClB extends ClA{
	public void print() {
		//print(); -> 재귀호출이 되어 스택오버플로우 발생(쉽게 말해서 무한루프)
		super.print();
		System.out.println("B클래스 입니다.");
	}
}
