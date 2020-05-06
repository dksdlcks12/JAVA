package day10;

public class PolymorphismEx2 {

	public static void main(String[] args) {
		/*
		Car arr[] = new Car[10];
		arr[0] = new KiaCar();
		arr[1] = new HyundaiCar();
		 */
		Car arr[] = new Car[10];
		arr[0] = new KiaCar("모닝");
		arr[1] = new KiaCar("K3");
		arr[2] = new KiaCar("쏘울");
		arr[3] = new HyundaiCar("아반떼");
		arr[4] = new HyundaiCar("쏘나타");
		arr[5] = new HyundaiCar("그랜저");
		showCar(arr);
	}
	public static void showCar(Car []arr) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != null) {
				if(arr[i] instanceof KiaCar) {
					System.out.printf("%8s : %3s : %s\n", arr[i].manuFacturer, arr[i].name, ((KiaCar)arr[i]).kia);
				}
				if(arr[i] instanceof HyundaiCar) {
					System.out.printf("%8s : %3s : %s\n", arr[i].manuFacturer, arr[i].name, ((HyundaiCar)arr[i]).hyundai);
				}
				
			}
		}
	}

}
class Car {
	int wheel;
	String type;
	String manuFacturer;
	String name;
	public void checkCar(Car c) {
		
	}
	public Car() {
	
	}
	public Car(String manuFacturer, String name) {
		this.manuFacturer = manuFacturer;
		this.name = name;
	}
}
class KiaCar extends Car {
	String kia = "기아차 입니다.";
	public KiaCar() {
		manuFacturer="Kia";
	}
	public KiaCar(String name) {
		this.manuFacturer = "Kia";
		this.name = name;
	}
}
class HyundaiCar extends Car {
	String hyundai = "현대차 입니다.";
	public HyundaiCar() {
		manuFacturer="Hyundai";
	}
	public HyundaiCar(String name) {
		this.manuFacturer = "Hyundai";
		this.name = name;
	}
}