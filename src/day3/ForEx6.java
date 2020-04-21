package day3;

public class ForEx6 {

	public static void main(String[] args) {
		// 반복물에 이름을 붙여서 구구단출력에 break로 Loop로 지정된 반복문까지 나가도록 지시한 코드
		Loop : for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d X %d =%3d"+(i!=9 || j!=9?"\n":""), i, j, i*j);
				if(j==5) {
					break Loop;
				}
			}
			System.out.printf(i!=9?"\n":"");
		}
		System.exit(0);
	}

}
