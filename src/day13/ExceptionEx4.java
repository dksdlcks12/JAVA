package day13;

public class ExceptionEx4 {

	public static void main(String[] args) {
		try {
			throw new MyException("예외처리", 100);
		}catch (MyException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			
		}
	}

}
class MyException extends Exception {
	private final int ERR_CODE;

	public MyException(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}
	public MyException() {
		ERR_CODE = -1;
	}
	public MyException(int errCode) {
		ERR_CODE = errCode;
	}
	public MyException(String msg) {
		super(msg);
		ERR_CODE = -1;
	}
	public int getERR_CODE() {
		return ERR_CODE;
	}
	public String getMessage() {
		return "ERR_CODE : " + ERR_CODE + ", MSG : " +super.getMessage();
	}
}