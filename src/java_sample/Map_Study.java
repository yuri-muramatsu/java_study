package java_sample;

import java.util.HashMap;
import java.util.Map;

public class Map_Study {

	public static void main(final String[] args) {
		// Mapを使用した名前と点数の格納と取り出し
		final Map<String, Integer> score = new HashMap<>();
		score.put("小林", 55);
		score.put("吉田", 72);
		score.put("小島", 43);
		score.put("円谷", 80);

		final int a = score.get("小島");
		System.out.println(a);
		if ("吉田".isEmpty()) {
			System.out.println("なし");
		} else {
			final int b = score.get("吉田");
			System.out.println(b);
		}
		// キーの一覧
		for (final String key : score.keySet()) {
			final int value = score.get(key);
			System.out.println(key + "の点数は" + value);
		}
	}

}
