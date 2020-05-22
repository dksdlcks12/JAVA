package day20;

import java.util.*;

public class test1 {

	public static void main(String[] args) {
		

	}
	
}
//추가, 수정, 삭제, 검색
class dictionary{
	private Map<String, Word> dictionary = new HashMap<String, Word>();
	public void insertdic(Scanner get) {
		while(true) {
			System.out.print("단어를 입력하여 주십시오. : ");
			String word = get.nextLine();
			if(!dictionary.containsKey(word)) {
				Word wordset = new Word();
				System.out.print("품사를 입력하여 주십시오. : ");
				wordset.addGrammer(get.nextLine());
				System.out.print("뜻을 입력하여 주십시오. : ");
				wordset.addMean(get.nextLine());
				dictionary.put(word, wordset);
			}else {
				System.out.println("중복된 단어입니다.");
			}
			System.out.print("더 입력하실거면 Y를 입력을 중단하시려면 그 외의 문자를 입력하십시오. : ");
			if(get.next().charAt(0)!='Y' && get.next().charAt(0)!='y') {
				break;
			}
		}
	}
}

class Word{
	private List<String> grammer;
	private List<String> mean;
	public List<String> getGrammer() {
		return grammer;
	}
	public void addGrammer(String grammer) {
		this.grammer.add(grammer);
	}
	public List<String> getMean() {
		return mean;
	}
	public void addMean(String mean) {
		this.mean.add(mean);
	}
	
}