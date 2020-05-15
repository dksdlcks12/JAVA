package day16;

import java.util.*;

public class Test3 {
	static Scanner get = new Scanner(System.in);
	public static void main(String[] args) {
		List<Integer> com = new ArrayList<Integer>();
		List<Integer> player = new ArrayList<Integer>();
		randSet(com);
		System.out.println(com);
		game(com, player);
		get.close();
	}
	public static void randSet(List<Integer> com) {
		int min = 1, max = 10;
		while(com.size()<3) {
			int rand = new Random().nextInt(max-min+1)+min;
			if(!com.contains(rand)) {
				com.add(rand);
			}
		}
	}
	public static void getPlayer(List<Integer> player) { 
		System.out.print("정수 3개를 입력하십시오. : ");
		while(player.size()<3) {
			player.add(get.nextInt());
		}
	}
	public static void game(List<Integer> com, List<Integer> player) {
		while(true) {
			int st = 0, ball = 0, cont = 0;
			player.clear();
			getPlayer(player);
			while(cont<com.size()) {
				if(player.contains(com.get(cont))) {
					if(player.get(cont).equals(com.get(cont))) {
						st++;
					}else {
						ball++;
					}
				}
				cont++;
			}
			System.out.printf("%2d 스트라이크,%2d 볼,%2d 아웃\n", st, ball, 3-st-ball);
			if(st==3) {
				return;
			}
		}
	}
}

