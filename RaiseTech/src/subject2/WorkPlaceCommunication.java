package subject2;

//コミュニケーションインタフェースに対して実装
public class WorkPlaceCommunication implements Communication {

	//職場かどうかを判断するフィールド
	boolean isWorkPlace;

	//helloと受けたらhelloを返すメソッドgreetを実装
	@Override
	public String greet(String greetingWord) {
		if (greetingWord.equals("Hello")) {
			return "Hello";
		} else {
			return "・・・";
		}
	}

	//職場であれば挨拶するメソッド
	public void greetOrNot(boolean isWorkPlace) {
		if (isWorkPlace) {
			System.out.println("Hello");
		} else {
			System.out.println("・・・");
		}
	}

	//相手によって挨拶を変えるメソッド
	public String greetSomeone(String person) throws yourHeadIsTooHighException {

		if (person.equals("CEO")) {
			throw new yourHeadIsTooHighException("例外発生！頭が高いです");
		}

		if (person.equals("coworker")) {
			return "hi!";
		} else if (person.equals("boss")) {
			return "Hello,boss!";
		} else {
			return "hello";
		}
	}


}
