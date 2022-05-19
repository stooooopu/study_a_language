public class Boolean_예시 {
	public static int isNum(int x, int y) {
		int z = 0;
		z = x - y;
		return z;
	}

	public static int isNum1(int x, int y) {
		int z = 0;
		z = y - x;
		return z;
	}

	public static void main(String[] args) {

		int x = 5;
		int y = 5;
		boolean z = x > y;// true의 의미
		if (z) {
			System.out.println(isNum(x, y));
		} else {
			System.out.println(isNum1(x, y));
		}

		if (z) {
			System.out.println(isNum(x, y));
		}
		if (!z) {
			System.out.println(isNum1(x, y));
		}
	}
}
