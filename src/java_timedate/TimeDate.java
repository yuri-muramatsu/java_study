package java_timedate;

import java.util.Calendar;
import java.util.Date;

public class TimeDate {

	public static void main(final String[] args) {
		// 計算にかかった時間の表示
		final long start = System.currentTimeMillis();

		final int a = 15;
		final int b = 36;
		System.out.println("問題" + a + "×" + b + "の計算結果を入力しなさい。");
		int answer;
		do {
			answer = new java.util.Scanner(System.in).nextInt();
			if (answer == a * b) {
				System.out.println("正解！");
			} else {
				System.out.println("残念、不正解");
			}
		} while (answer != a * b);
		final long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は…" + (end - start) / 1000 + "秒でした。");

		// 現在時刻の取得
		final Date now = new Date();
		System.out.println("現在、" + now);
		System.out.println("ミリ秒で表記すると" + now.getTime() + "です");
		final long n = now.getTime();
		final Date past = new Date(0);
		System.out.println("ミリ秒の基準は、" + past + "です");

		// 誕生してから今日が何日目か計算する処理
		final Calendar c = Calendar.getInstance();
		final int year = 1990;
		final int month = 4;
		final int day = 20;
		final int hours = 11;
		final int minutes = 24;
		final int seconds = 20;
		c.set(year, month, day, hours, minutes, seconds);
		final Date mybirth = c.getTime();
		final long m = mybirth.getTime();
		System.out.println("私の誕生日は" + mybirth);
		System.out.println("私が生まれてから、" + ((n - m) / 1000) / (60 * 60 * 24) + "日経った");

		// 今日が西暦何年か表記する
		final Date birth = new Date();
		c.setTime(birth);
		final int y = c.get(Calendar.YEAR);
		System.out.println("今日生まれた赤ちゃんは" + y + "年生まれです。");
	}

}
