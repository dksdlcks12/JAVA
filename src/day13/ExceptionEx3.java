package day13;

public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
			System.out.println(cal(1,'?',0));
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	/* 메서드 안에서 throws를 이용하여 강제적으로 예외를 발생시키는데 예외클래스가 RuntimeException의 하위 클래스가 아니면 
	 * 선언부에 throws 클래스타입을 명시해줘야 한다.
	 */
	public static double cal(int num1, char op, int num2) throws Exception {
		switch(op){
		case '+' : return num1+num2;
		case '-' : return num1-num2;	
		case '*' : return num1*num2;
		case '/' : 
			if(num2==0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			}
			return (double)num1/num2;
		case '%' : 
			if(num2==0) {
				throw new ArithmeticException("0으로 나눌 수 없습니다.");
			}
			return num1%num2;
		default : throw new Exception(op+"는 산술연산자가 아닙니다.");
		}
	}
}

