package day15;

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		//1. 당첨번호 6개의 중복되지 않는 난수 && 1개의 중복되지 않는 난수
		//   난수 범위는 1~45
		//2. 자동번호 6개의 중복되지 않는 난수
		//3. 맞은 갯수를 체크 + 보너스 번호가 맞는지 체크

		HashSet<Integer> winnum = new HashSet<Integer>();
		HashSet<Integer> auto = new HashSet<Integer>();
		int min = 1, max = 45, bonus = 0;
		setlotto(winnum, min, max);
		while(bonus==0 || winnum.contains(bonus)) {
			bonus = randnum(min, max);
		}
		setlotto(auto, min, max);
		for(Integer tmp : winnum) {
			System.out.printf("%2d ", tmp);
		}
		System.out.printf("bonus : %2d\n",bonus);
		for(Integer tmp : auto) {
			System.out.printf("%2d ", tmp);
		}
		System.out.println();
		System.out.printf("%s", comp(winnum, bonus, auto));
		
	}
	public static void setlotto(HashSet<Integer> lotto, int min, int max) {
		while(lotto.size()<6) {
			lotto.add(randnum(min, max));
		}
	}
	public static int randnum(int min, int max) {
		return new Random().nextInt(max-min)+min;
	}
	public static String comp(HashSet<Integer> winnum, int bonus, HashSet<Integer> auto) {
		int cont=0;
		Iterator<Integer> comp = auto.iterator();
		while(comp.hasNext()) {
			int tmp = comp.next();
			if(winnum.contains(tmp)) {
				System.out.printf("%2d ", tmp);
				cont++;
			}
		}
		System.out.println();
		if(cont==6) {
			return "1등 입니다.";
		}else if(cont==5 && auto.contains(bonus)) {
			return "2등 입니다.";
		}else if(cont==5) {
			return "3등 입니다.";
		}else if(cont==4) {
			return "4등 입니다.";
		}else if(cont==3) {
			return "5등 입니다.";
		}
		return "꽝";
	}
}

