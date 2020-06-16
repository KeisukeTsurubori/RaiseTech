package subject2;

public class PrintTrueOrFalse {
	//真偽を表示するメソッド
	public void printTrueOrFalse(int value) {
		if (value == 0) {
			System.out.println("偽");
		} else if (value == 1) {
			System.out.println("真");
		} else {
			System.out.println("引数には0か1を指定してください");
		}
	}
}
