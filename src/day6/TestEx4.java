package day6;

public class TestEx4 {
	private static void prtArr(int arr[]) {
		for(int prt : arr) {
			System.out.printf("%d ", prt);
		}
		System.out.println();
	}
	private static int[] resetArr(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			arr[i]=0;
		}
		return arr;
	}
	private static int[] setArrNum(int arr[], int num) {
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+num;
		}
		return arr;
	}
	private static int[] setArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i]=i;
		}
		return arr;
	}
	private static boolean checkArr(int arr[], int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	}
	private static int[] randsetArr(int arr[], int num1, int num2) {
		int min, max, rand=0;
		if(num1<num2) {
			min=num1;
			max=num2;
		}else {
			min=num2;
			max=num1;
		}
		for(int i=0; i<arr.length; i++) {
			rand=(int)(Math.random()*(max-min+1)+min);
			while(checkArr(arr, rand)) {
				rand=(int)(Math.random()*(max-min+1)+min);
			}
			arr[i]=rand;
		}
		return arr;
	}
	public static void main(String[] args) {
		// 크기5인 정수형배열 생성  배열출력
		int arr[] = new int[10];
		prtArr(arr);
		setArr(arr);
		prtArr(arr);
		resetArr(arr);
		prtArr(arr);
		setArrNum(arr, 90);
		prtArr(arr);
		randsetArr(arr, 1, 40);
		prtArr(arr);
	}

}
