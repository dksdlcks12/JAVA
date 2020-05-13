package day15;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		// 오늘의 할 일을 리스트에 저장하고 출력하는 코드를 선열리스트를 이용하여 구현
		// Y를 입렬받으면 입력받고 N을 입력하면 종료하도록
		Scanner get = new Scanner(System.in);
		ArrayList<String> plan = new ArrayList<String>();
		char check;
		while(true) {
			System.out.print("오늘 할 일을 추가하시겠습니까?(y/n) : ");
			check = get.next().charAt(0);
			while(check!='y' && check!='Y' && check!='n' && check!='N') {
				System.out.println("y나 n이 아닙니다. 다시 입력하여 주십시오. : ");
				check = get.next().charAt(0);
			}
			get.nextLine();
			if(check=='y' || check=='Y') {
				System.out.print("일정을 입력하여 주십시오. : ");
				plan.add(get.nextLine());
			}else if(check=='n' || check=='N') {
				break;
			}
		}
		for(int i=0; i<plan.size(); i++) {
			System.out.printf("%4d. %s\n", i+1, plan.get(i));
		}
		get.close();
	}

}
