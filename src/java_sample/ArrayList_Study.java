package java_sample;

import java.util.ArrayList;

public class ArrayList_Study {

	public static void main(final String[] args) {
		// 配列を使ったコード
		final String[] names = new String[3];
		names[0] = "佐藤";
		names[1] = "武藤";
		names[2] = "加藤";
		System.out.println(names[1]);

		// ArrayListを使ったコード
		final ArrayList<String> alnames = new ArrayList<>();
		alnames.add("工藤");
		alnames.add("毛利");
		alnames.add("服部");
		System.out.println(alnames.get(2));

		// ArrayListを使ったint型の情報の格納と取り出し
		final ArrayList<Integer> points = new ArrayList<>();
		points.add(36);
		points.add(45);
		points.add(54);
		for (final int i : points) {
			System.out.print(i + ",");
		}
		final Integer i1 = Integer.valueOf(16);
		final int i2 = i1.intValue();
		System.out.println(i2);

		// ArrayListのメソッドの利用
		final ArrayList<String> onigiri = new ArrayList<>();
		onigiri.add("しゃけ");
		onigiri.add("おかか");
		onigiri.add("明太子");
		onigiri.add("こんぶ");
		onigiri.add(1, "ツナマヨ");
		for (final String gu : onigiri) {
			System.out.println(gu);
		}
		System.out.println();
		System.out.println(onigiri.get(1));
		onigiri.set(4, "うめ");
		System.out.println();
		for (final String o : onigiri) {
			System.out.println(o);
		}
	}

}
