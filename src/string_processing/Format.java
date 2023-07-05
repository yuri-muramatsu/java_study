package string_processing;

public class Format {

	public static void main(final String[] args) {
		// 文字列の書式整形
		final String st = String.format("%d日で%sわかる%s入門", 3, "すっきり", "Java");
		System.out.println(st);
		System.out.println();

		System.out.printf("名称%-9s エネルギー量%,4dkcal 食塩相当量%-3.1fg", "ミートスパゲッティ", 614, 5.2);
	}

}
