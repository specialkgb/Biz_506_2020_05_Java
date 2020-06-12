
public class Java_homework {

	public static void main(String[] args) {

		int a = 44;
		int b = 34;
		int c = 35;
		int temp = 0;

		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		if (a > c) {
			temp = a;
			a = c;
			c = temp;
		}
		
		if (b > c) {
			temp = b;
			b = c;
			c = temp;

			System.out.printf("%d\t%d\t%d", a, b, c);

		}
	}
}