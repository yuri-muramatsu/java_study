package java_sample;

public class Array {

	public static void main(final String[] args) {
		// 配列を用いて、口座残高の情報を並べる
		final int[] moneyList = { 121902, 8302, 55100 };
		for (final int element : moneyList) {
			System.out.println(element);
		}
		System.out.println();

		// 配列を用いて、曜日を並べる
		final char[] day = new char[] { '月', '火', '水', '木', '金', '土', '日' };
		for (final char element : day) {
			System.out.print(element + " ");
		}
		System.out.println(day[2]);
		System.out.println();

		// 配列を用いて、点数の合計、平均点、カウントを行う
		final int[] scores = { 25, 64, 35, 77, 23, 56, 67 };
		int sum = 0;
		int count = 0;
		for (final int score : scores) {
			sum += score;
			if (score >= 50) {
				count++;
			}
		}
		final int avg = sum / scores.length;
		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + avg);
		System.out.println("50点以上の科目数は：" + count);
		System.out.println();

		// 数字あてゲーム
		final int[] numbers = { 2, 3, 5, 7 };
		System.out.println("1桁の数字を入力してください。");
		final int input = new java.util.Scanner(System.in).nextInt();
		for (final int n : numbers) {
			if (input == n) {
				System.out.println("あたり！！");
			}
		}
	}

}
