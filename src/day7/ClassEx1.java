package day7;

public class ClassEx1 {

	public static void main(String[] args) {
		//클래스 메소드 호출은 클래스명.클래스메소드명 || 객체.클래스메소드명
		Car.printInfo();
		Car c1 = new Car();
		//c1.printInfo();//가능하지만 권장X
		c1.printCarInfo();
		Car.printInfo();
		Car c2 = new Car("뉴그랜버드", 6);
		c2.printCarInfo();
		Car.printInfo();
		for(int i=0; i<10; i++) {
			c2.accelerator();
			c2.printSpeed();
		}
		for(int i=0; i<20; i++) {
			c2.gearbreak();
			c2.printSpeed();
		}
	}

}
class Car{
	//클래스 변수
	private static String manufacturer = "KIA";
	private static int salesNumber = 0;
	//객체 변수
	int wheel;
	boolean power;
	int speed;
	String carName;
	String carNum;
	//클래스 메소드
	public static String getManufacturer() {
		return manufacturer;
	}
	public static int getSalesNumber() {
		return salesNumber;
	}
	public static void printInfo() {
		System.out.println("제조사 : " + manufacturer);
		System.out.println("판매량 : " + salesNumber + "대");
	}
	//객체 메소드
	public void turnOn() {
		System.out.println("시동을 걸었습니다.");
		power = true;
	}
	public void turnoff() {
		if(speed==0) {
			System.out.println("시동이 꺼겼습니다.");
			power = false;
		}else {
			System.out.println("속도가 0이 아니므로 시동을 끌 수 없습니다.");
		}
	}
	public void accelerator() {
		speed++;
	}
	public void gearbreak() {
		if(0<speed) {
			speed--;
		}
	}
	public void printSpeed() {
		System.out.println("현재 속도는 " + speed + "km/h입니다.");
	}
	public void printCarInfo() {
		System.out.println("차종 : " + carName);
		System.out.println("바퀴수 : " + wheel);
		printSpeed();
	}
	//생성자
	public Car() {
		wheel = 4;
		carName = "NULL";
		salesNumber++;
	}
	public Car(String carName, int wheel) {
		//우선순위 : 매개변수>멤버변수
		this.carName = carName;
		this.wheel = wheel;
		salesNumber++;  
	}
}
