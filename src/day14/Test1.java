package day14;

import static java.lang.Math.*;

public class Test1 {

	public static void main(String[] args) {
		Point1 p = new Point1(3,4);
		System.out.println(p.equals(new Point1(0,0)));
		System.out.println(p);
		System.out.println(p.distance(new Point1(0,0)));
	}

}
class Point1 {
	private int x, y;
	
	public Point1() {
		
	}
	public Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point1 other = (Point1) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Point1 [x=" + x + ", y=" + y + "]";
	}
	public double distance(Point1 p) {
		return sqrt((pow(this.x-p.x, 2)+(pow(this.y-p.y, 2))));
	}
	
 	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}