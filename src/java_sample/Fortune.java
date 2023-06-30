package java_sample;

public class Fortune {

	public static void main(final String[] args) {
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください。");
		final String name = new java.util.Scanner(System.in).nextLine();
		if (name != null) {
			System.out.println("あなたの星座を入力してください。");
			final String zodiacsignString = new java.util.Scanner(System.in).nextLine();
			if (zodiacsignString != null) {
				int fortune = new java.util.Random().nextInt(3);
				fortune++;
				System.out.println("占いの結果が出ました！");
				System.out.println(zodiacsignString + "座の" + name + "さん");
				switch (fortune) {
				case 1:
					System.out.println(zodiacsignString + "座の" + name + "さんの運勢は大吉！");
					break;
				case 2:
					System.out.println(zodiacsignString + "座の" + name + "さんの運勢は中吉！");
					break;
				case 3:
					System.out.println(zodiacsignString + "座の" + name + "さんの運勢は小吉！");
					break;
				default:
					System.out.println(zodiacsignString + "座の" + name + "さんの運勢は凶！家から出ない方がいいでしょう。");
				}
			} else {
				System.out.println("入力が正しくありません。");
			}
		}
	}

}
