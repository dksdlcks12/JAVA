package day9;

public class InheritanceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Shape(5,5,10,10);
		s1.prt();
		s1.resize(4, 5);
		s1.move(10, 10);
		s1.prt();
		Square sq1 = new Square(5,5,10,10);
		sq1.prt();
		sq1.resize(4, 6);
		sq1.move(0 , 0);
		sq1.prt();
		sq1.setUp(9);
		sq1.prt();
		Circle cir1 = new Circle(0,0,5);
		cir1.prt();
		cir1.move(0, 5);
		cir1.prt(); 
		cir1.resize(2);
		cir1.prt();
		Circle cir2 = new Circle();
		cir2.setUp(0);
		Shape.viewcont();
		Circle.viewcont();
		Square.viewcont();
	}

}
