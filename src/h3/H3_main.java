package h3;

public class H3_main {
	public static void main(String[] args) {
		int i = 101;
		int j = 8;
		int k = -10;

		boolean expr1 = i > j;
		boolean expr2 = i > 200;
		boolean expr3 = j > 100;

		if (expr1) {
			if (expr2) {
				if (expr3) {
					k = 3;
				} else {
					k = 2;
				}
			} else {
				if (!expr3) {
					k = 1;
				}

			}
		} else {
			if (!expr2) {
				if (!expr3) {
					k = 4;
				}

			}

		}

		System.out.println("i = " + i + ", j = " + j + ", k = " + k);
	}
}
