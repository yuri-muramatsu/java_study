package string_processing;

public class RegularExpression {

	public static void main(final String[] args) {
		// 正規表現
		System.out.println("ユーザー名を入力してください。");
		final String username = new java.util.Scanner(System.in).nextLine();
		if (username.matches("[A-Z][A-Z\\d]{7}")) {
			System.out.println("「" + username + "」で、ユーザー名を登録しました。");
		} else {
			System.out.println("このユーザー名は使えません、条件を確認し、再度入力してください。");
		}
		System.out.println();

		// 文字列の分割
		final String tanka = "はるすぎて,なつきにけらし,しろたえの:ころもほすてふ,あまのかぐやま";
		final String[] hyakuninnissyu = tanka.split("[,:]");
		for (final String t : hyakuninnissyu) {
			System.out.print(t + " ");
		}
		System.out.println();

		// 文字列の置換
		final String hayakutikotoba = "かえるぴょこぴょこ:みぴょこぴょこ:あわせてぴょこぴょこ:むぴょこぴょこ";
		final String st = hayakutikotoba.replaceAll("ぴょこ", "P").replaceAll(":", " ");
		System.out.print(st + " ");
	}

}
