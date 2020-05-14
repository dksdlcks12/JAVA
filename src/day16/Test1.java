package day16;

import java.util.*;

public class Test1 {
	static Scanner get = new Scanner(System.in);
	public static void main(String[] args) {
		Map<String, String> profile = new HashMap<String, String>();
		char num = 0;
		try {
			while (num!=4) {
				System.out.println("1.등록, 2.검색, 3.수정, 4.종료");
				System.out.print("원하는 메뉴의 번호를 입력하십시오. : ");
				num = get.next().charAt(0);
				if(num=='1') {
					addProfile(profile);
				}else if(num=='2') {
					searchProfile(profile);
				}else if(num=='3') {
					modifyProfile(profile);
				}else if(num=='4') {
					break;
				}else {
					System.out.println("메뉴에 등록되지 않은 번호입니다.");
				}
			}
		}catch(Exception e) {
			System.out.println("오류가 발생하여 프로그램을 종료합니다.");
		}
		get.close();
	}
	public static void addProfile(Map<String, String> profile) {
		System.out.print("ID를 입력하십시오. : ");
		String id = get.next();
		while(profile.containsKey(id)) {
			System.out.print("중복된 ID가 있습니다 다른 ID를 입력하여 주십시오. : ");
			id = get.next();
		}
		System.out.print("PW를 입력하십시오. : ");
		String pw = get.next();
		profile.put(id, pw);

	}
	public static void searchProfile(Map<String, String> profile) {
		if(profile.size()!=0) {
			System.out.print("검색할 ID를 입력하십시오. : ");
			String id = get.next();
			if(profile.containsKey(id)) {
				System.out.printf("%s의 PW는 %s 입니다.\n", id, profile.get(id));
			}else {
				System.out.printf("%s는 존재하지 않는 ID입니다.\n", id);
			}
		}else {
			System.out.println("등록된 ID가 존재하지 않습니다.");
		}
	}
	public static void modifyProfile(Map<String, String> profile) {
		if(profile.size()!=0) {
			System.out.print("비밀번호를 변경할 ID를 입력하십시오. : ");
			String id = get.next();
			if(profile.containsKey(id)) {
				System.out.print("현재 비밀번호를 입력하십시오. : ");
				String pwNow = get.next();
				if(profile.get(id).contains(pwNow)) {
					System.out.print("변경할 비밀번호를 입력하십시오. : ");
					String pwCon = get.next();
					profile.replace(id, pwCon);
				}else {
					System.out.println("현재 비밀번호가 아닙니다.");
				}
			}else {
				System.out.printf("%s는 존재하지 않는 ID입니다.\n", id);
			}
		}else {
			System.out.println("등록된 ID가 존재하지 않습니다.");
		}
	}

}
