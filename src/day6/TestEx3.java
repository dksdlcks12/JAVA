package day6;

public class TestEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[4];
		for(int tmp : arr) {
			System.out.printf("%4d", tmp);
		}
		System.out.println();
		set(arr, 5);
	}
	
	public static void set(int[] arr, int num) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = num;
		}
	}
}
