package day18;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		System.out.print("점수를 입력하십시오 : ");
		try {
			System.out.printf("학점 : %c", unit(get.nextDouble()));
		}catch(ArithmeticException e) {
			System.out.println("입력한 값이 점수의 범위 밖입니다.");
		}catch(Exception e) {
			System.out.println("입력된 값이 숫자가 아닙니다.");
		}
		get.close();
	}
	/**
	 * 
	 * @param score
	 * @return
	 */
	public static char unit(Double score) {
		if(score<0 || 100<score) {
			throw new ArithmeticException();
		}
		if(90<=score) {
			return 'A';
		}else if(80<=score) {
			return 'B';
		}else if(70<=score) {
			return 'C';
		}else if(60<=score) {
			return 'D';
		}else {
			return 'F';
		}
	}
}

class engDictionary{
	List<Word> wordList = new ArrayList<Word>();
	Scanner scan = new Scanner(System.in);
	public void wordAdd(Scanner scan, List<Word> wordList) {
		
	}
	public void wordDel(Scanner scan, List<Word> wordList) {
		
	}
	public void wordMod(Scanner scan, List<Word> wordList) {
		
	}
	public void wordSearch(Scanner scan, List<Word> wordList) {
		
	}
	public boolean overlap(Scanner scan, List<Word> wordList) {
		return false;
	}

}
class Word{
	private String word;
	private HashMap<String, List<String>> mean = new HashMap<String, List<String>>();
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public HashMap<String, List<String>> getMean() {
		return mean;
	}
	public void setMean(HashMap<String, List<String>> mean) {
		this.mean = mean;
	}

	
}