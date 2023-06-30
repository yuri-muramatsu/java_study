package java_sample;

public class BmiCalculation {

	public static void main(final String[] args) {
		System.out.println("こんにちは！ここではあなたのBMIを計算します。");
		// 名前の入力
		System.out.println("まずは、あなたのお名前を入力してください。");
		final String name = new java.util.Scanner(System.in).nextLine();
		if (name == null) {
			System.out.println("名前が入力されていません。");
		} else {
			// 体重の入力
			System.out.println("体重を入力してください。");
			final String weightString = new java.util.Scanner(System.in).nextLine();
			if (weightString == null) {
				System.out.println("体重が入力されていません。");
			} else {
				final int weight = Integer.parseInt(weightString);
				// 身長の入力
				System.out.println("最後に身長を入力してください。");
				final String highString = new java.util.Scanner(System.in).nextLine();
				if (highString == null) {
					System.out.println("身長が入力されていません。");
				} else {
					final int high = Integer.parseInt(highString);
					// BMIの計算
					double bmi;
					bmi = weight / ((high * high) / 10000.0);
					System.out.println(String.format("あなたのBIMは%.1fです。", bmi));

					// 肥満度の判定
					System.out.println("BMIから" + name + "さんの肥満度がわかります。");
					if (bmi < 18.5) {
						System.out.println("判定は「低体重」です。");
						System.out.println("無理のない範囲で体重を増やした方がいいでしょう。");
					} else if (bmi >= 18.5 && bmi < 25) {
						System.out.println("判定は「普通体重」です。");
						System.out.println("適正な体重です。維持していきましょう。");
					} else if (bmi >= 25 && bmi < 30) {
						System.out.println("判定は「軽度肥満」です。");
						System.out.println("少し肥満気味です。まだ間に合います。痩せましょう。");
					} else if (bmi >= 30) {
						System.out.println("判定は「肥満」です。");
						System.out.println("病院に行きましょう。将来的に生活習慣病になります。");
					}
				}
			}
		}
	}

}
