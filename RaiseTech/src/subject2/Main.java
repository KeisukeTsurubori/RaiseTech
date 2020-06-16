package subject2;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		//変数に格納してHelloWOrldを出力
		String greeting = "Hello World!";
		System.out.println(greeting);


		//for文を使って1から10を足した結果を出力
		int sum1 = 0;
		for (int i = 1; i <= 10; i++) {
			sum1 += i;
		}
		System.out.println("1から10まで足した結果は" + sum1);


		//streamを使って1から10を足した結果を出力
		int sum2 = IntStream.range(1, 11).sum();
		System.out.println("1から10まで足した結果は" + sum2);


		//3年後の今日の曜日
		LocalDateTime ldt =LocalDateTime.now();
		DayOfWeek dayOfWeek = ldt.plusYears(3).getDayOfWeek();
		System.out.println("3年後の今日の曜日は" + dayOfWeek + "です");


		//Mapを作成し内容を表示（格納順に取り出したかったのでLinkedHashMapを使いました）
		LinkedHashMap<String, String> weeks = new LinkedHashMap<>();

		weeks.put("Monday", "月曜日");
		weeks.put("Tuesday", "火曜日");
		weeks.put("Wednesday", "水曜日");
		weeks.put("Thursday", "木曜日");
		weeks.put("Friday", "金曜日");
		weeks.put("Saturday", "土曜日");
		weeks.put("Sunday", "日曜日");

		for (String key : weeks.keySet()) {
			String weekNameJP = weeks.get(key);
			System.out.println(key + "は日本語で" + weekNameJP + "です");
		}


		//真偽を表示するメソッドを実行
		PrintTrueOrFalse ptof = new PrintTrueOrFalse();
		ptof.printTrueOrFalse(1);


		//コミュニケーションクラス関連
		WorkPlaceCommunication wpc = new WorkPlaceCommunication();

		//helloを渡したらhelloを返すメソッドを実行
		System.out.println(wpc.greet("Hello"));

		//職場かどうか判断して挨拶
		wpc.greetOrNot(true);

		//相手が誰かを判断して挨拶
		try {
			System.out.println(wpc.greetSomeone("CEO"));

		} catch (yourHeadIsTooHighException e) {
			e.printStackTrace();
		}


	}
}
