package day4;

public class Test4 {

	public static void main(String[] args) {
		// 정수 10개짜리 배열 값을 랜덤으로 생성하여 저장하고 저장된 배열 값 중에서 가장 큰 값과 가장 작은 값을 출력 하는 코드
		int num[] = new int[10];
		int max=0, min=0;
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*100+1);
		}
		for(int prt : num) {
			System.out.printf("%4d", prt);
		}
		System.out.println();
		max=min=num[0];
		for(int i=1; i<num.length; i++) {
			if(max<num[i]) {
				max=num[i];
			}
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.printf("최솟값은%4d, 최댓값은%4d입니다.", min, max);
		System.exit(0);
	}

}
