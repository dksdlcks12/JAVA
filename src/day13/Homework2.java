package day13;

import java.util.Scanner;

public class Homework2 {
	static Scanner get = new Scanner(System.in);
	public static void main(String[] args) {
		Printer prt = new Printer();
		prt.input();
		prt.output();
		get.close();
	}

}
class Product {
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
    public Product(Product p) {
    	name = p.name;
    	price = p.price;
    }
	public Product() {
	}
    
}
class Printer {
	private Product receipt[] = new Product[50];
	int cont = 0;
	public void input() {
		System.out.println("상품명과 가격을 입력하시려면 Y를 아니면 다른 키를 입력하십시오. : " );
		char check = Homework2.get.next().charAt(0);
		while(check == 'y' || check == 'Y') {
			Product p = new Product();
			System.out.print("상품명을 입력하십시오 . : ");
			p.setName(Homework2.get.next());
			System.out.print("가격을 입력하십시오. : ");
			p.setPrice(Homework2.get.nextInt());
			this.receipt[cont] = new Product(p);
			cont++;
			System.out.println("상품명과 가격을 입력하시려면 Y를 아니면 다른 키를 입력하십시오. : " );
			check = Homework2.get.next().charAt(0);
		}
		cont = 0;
	}
	public void output() {
		while(receipt[cont] != null) {
			System.out.printf("%2d. 상품명 : %9s, 가격 : %d원\n", cont+1,receipt[cont].getName(), receipt[cont].getPrice());
			cont++;
		}
		cont = 0;
	}
}