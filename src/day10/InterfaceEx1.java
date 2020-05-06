package day10;

public class InterfaceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface RemoteController{
	int num = 10;
	public int chUp(int ch);
	public int chDown(int ch);
	public int volUp(int vol);
	public int volDown(int vol);
	public default void test() {}	//	디폴트 메서드
}
class TvRemoteController implements RemoteController{

	@Override
	public int chUp(int ch) {
		return ++ch;
	}

	@Override
	public int chDown(int ch) {
		return --ch;
	}

	@Override
	public int volUp(int vol) {
		return ++vol;
	}

	@Override
	public int volDown(int vol) {
		return --vol;
	}

}