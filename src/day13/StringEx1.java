package day13;

public class StringEx1 {

	public static void main(String[] args) {
		// str1과 str2는 둘다 abc라는 문자열리터러를 저장하기때문에 같은 주소를 가진다
		// str2를 대입하기전에 메모리에 해당 리터럴이 있는지 확인하고 있으면 재사용
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2);
		String str3 = new String("abc");
		String str4 = new String("abc");
		str3 = str3.intern();
		str4 = str4.intern();
		System.out.println(str3 == str4);
		System.out.println(str3.contentEquals(str4));
		char arr[] = {'a', 'b', 'c'};
		String str5 = new String(arr);
		System.out.println(str5.charAt(1));
	}

}
