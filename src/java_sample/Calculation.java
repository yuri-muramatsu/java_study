package java_sample;

public class Calculation {

	public static void main(final String[] args) {
		final int returnfactorial = 階乗(10);
		System.out.println(returnfactorial);

		final int number = 余り計算(123);
		System.out.println(number);
	}

	public static int 階乗(final int number) {
		// 階乗の計算
		int f = 1;
		for (int i = 1; i <= number; i++) {
			f = f * i;
		}
		return f;
	}

	public static int 余り計算(final int num) {
		// 3の倍数の判定
		final int ans = num % 3;
		if (ans == 0) {
			System.out.println(num + "は3の倍数です。");
		} else {
			System.out.println(num + "は3の倍数ではありません。");
		}
		return ans;
	}

}
