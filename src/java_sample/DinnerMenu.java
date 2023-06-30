package java_sample;

public class DinnerMenu {

	public static void main(final String[] args) {
		System.out.println("こんばんは。今日の夕飯のメニューを勝手に決めてあげます！");
		final int menu = new java.util.Random().nextInt(365);
		if (menu < 180) {
			System.out.println("今晩は和食です。");
		} else if (menu >= 180 && menu < 270) {
			System.out.println("今晩は洋食です。");
		} else if (menu >= 270 && menu < 365) {
			System.out.println("今晩は中華です。");
		} else {
			System.out.println("夕飯抜きです。");
		}
		System.out.println();
	}

}
