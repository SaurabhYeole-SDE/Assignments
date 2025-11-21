package stringOperationAndDataConversion;

public class StarPattern {

	public static void main(String[] args) {
		int rows = 5;

		for (int i = 1; i <= rows; i++) {

			for (int space = rows - i; space > 0; space--) {
				System.out.print(" ");
			}

			for (int star = 1; star <= i; star++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
