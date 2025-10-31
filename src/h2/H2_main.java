package h2;

public class H2_main {
	public static void main(String[] args) {
		int i = 7;
		int j = 3;
		int k = 9;
		int min;
		int max;

		min = i;
		if (j < min) {
			min = j;
		}
		if (k < min) {
			min = k;
		}

		max = i;
		if (j > max) {
			max = j;
		}
		if (k > max) {
			max = k;
		}

		System.out.println("i = " + i + ", j = " + j + ", k = " + k);
		System.out.println("min = " + min);
		System.out.println("max = " + max);
	}
}
