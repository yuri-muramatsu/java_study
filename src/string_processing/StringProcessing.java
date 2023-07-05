package string_processing;

public class StringProcessing {

	public static void main(final String[] args) {
		final String s1 = "すもももももももものうち";
		// 文字列の長さを調べる
		System.out.println("s1の長さは" + s1.length() + "です。");
		// 空文字か調べる
		if (s1.isEmpty()) {
			System.out.println("s1は空文字です。");
		}
		final String s2 = "Java";
		// 大文字を小文字に変換する
		System.out.println(s2.toLowerCase());
		final String s3 = "java";
		// 小文字を大文字に変換する
		System.out.println(s3.toUpperCase());
		// 文字列の内容が等しいか調べる
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		} else {
			System.out.println("s2とs3は違う");
		}
		// 大文字、小文字を区別せず、内容が等しいか調べる
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		final String s4 = "東京特許許可局";
		// 文字列の一部に指定の文字列を含むか調べる
		if (s4.contains("特許")) {
			System.out.println("文字列s4は、特許を含んでいます。");
		}
		final String s5 = "隣の客はよく柿食う客だ";
		// 文字列が指定の文字列で終わるか調べる
		if (s5.endsWith("客")) {
			System.out.println("文字列s5は、客が末尾にあります。");
		} else {
			System.out.println("文字列s5は、客が末尾にありません。");
		}
		// 指定の文字列が最初に登場する位置を調べる
		System.out.println("文字列s5で最初に客が登場する位置は" + s5.indexOf("客"));
		final String s6 = "竹垣に竹、立てかけた";
		// 指定の文字列が後ろから検索して、最初に登場する位置を調べる
		System.out.println("文字列s6で最後に竹が登場する位置は" + s6.lastIndexOf("竹"));
		final String s7 = "きみがためはるののにいでてわかなつむわがころもでにゆきはふりつつ";
		// 指定位置から始まる文字列を任意の長さだけ切り出す
		System.out.println("文字列s7の決まり字以降は" + s7.substring(5));
		System.out.println("文字列s7の上の句は" + s7.substring(0, 18));
		// 文字列を置き換える
		System.out.println(s7.replace("にゆきはふりつつ", "はつゆにぬれつつ"));
	}

}
