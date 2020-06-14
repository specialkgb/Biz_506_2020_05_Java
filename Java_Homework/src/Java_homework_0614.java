import java.util.Arrays;
import java.util.Random;

public class Java_homework {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] num = new int[6];

		for (int i = 0; i < num.length; i++) {
			num[i] = rnd.nextInt(45) + 1;
		}
		System.out.println();
		Arrays.sort(num);
		for (int i : num) {
			System.out.println(i + " ");

		}
	}
}
/*
 * int a = 44; int b = 34; int c = 35; int temp = 0;
 *
 *
 * if (a > b) { temp = a; a = b; b = temp; }
 *
 * if (a > c) { temp = a; a = c; c = temp; }
 *
 * if (b > c) { temp = b; b = c; c = temp;
 *
 * System.out.printf("%d\t%d\t%d", a, b, c);
 */