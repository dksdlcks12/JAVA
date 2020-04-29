package day9;

public class Circle extends Shape {
	private double centerX, centerY, radius;
	private static int contCir;
	public void prt() {
		System.out.printf("----------------원의 정보---------------\n");
		System.out.printf("중심점(%.1f, %.1f)\n", centerX, centerY);
		System.out.printf("반지름 : %.2f\n", radius);
		System.out.printf("--------------------------------------\n");
	}
	public void move(int left, int up) {
		super.move(left, up);
		centerX = left+radius;
		centerY = up-radius;
	}
	public void resize(double radius) {
		super.resize(radius*2, radius*2);
		centerX = centerX+(radius-this.radius);
		centerY = centerY-(radius-this.radius);
		this.radius = radius;
	}
	public static void viewcont() {
		System.out.printf("%d개의 원을 만들었습니다.\n", Circle.getContCir());
		System.out.printf("--------------------------------------\n");
	}
	public Circle() {
		contCir++;
	}
	public Circle(int left, int up, double radius) {
		super(left, up, radius*2, radius*2);
		centerX = left + radius;
		centerY = up - radius;
		this.radius = radius;
		contCir++;
	}
	public static int getContCir() {
		return contCir;
	}

}
