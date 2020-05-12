package day14;

import java.util.Objects;

public class ObjectsEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		System.out.println(Objects.isNull(str));
		System.out.println(!Objects.isNull(str));
		System.out.println(Objects.nonNull(str));
		String str2 = "";
		//System.out.println(str.equals(str2));
		System.out.println(Objects.equals(str, str2));
	}

}
