package string_processing;

public class Concatenation {

	public static void main(final String[] args) {
		// 文字列の連結
		final StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 10; i++) {
			sb.append("しか");
		}
		final String s = sb.toString();

		System.out.println("「しか」って10回言って。");
		System.out.println(s);
		System.out.println("サンタクロースが乗っているのは？");
		System.out.println("トナカイ！");
		System.out.println("残念、そりでした！");
	}

}
