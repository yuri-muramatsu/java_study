package java_sample;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Study {

	public static void main(final String[] args) {
		// Setを使用した東京23区の格納と情報の取り出し
		final Set<String> city = new HashSet<>();
		city.add("中央区");
		city.add("千代田区");
		city.add("台東区");
		city.add("文京区");
		city.add("大田区");
		city.add("世田谷区");
		city.add("葛飾区");
		for (final String ku : city) {
			System.out.println(ku);
		}
		System.out.println(city.size());
		if (city.contains("葛飾区")) {
			System.out.println("含まれます。");
		}
		System.out.println("");
		city.remove("千代田区");
		for (final String y : city) {
			System.out.println(y);
		}
		System.out.println("");

		// TreeSetで自然順序付けを行った情報の格納と取り出し
		final Set<String> menu = new TreeSet<>();
		menu.add("オムライス");
		menu.add("カレーライス");
		menu.add("みそ汁");
		menu.add("ぎょうざ");
		for (final String i : menu) {
			System.out.println(i);
		}
	}

}
