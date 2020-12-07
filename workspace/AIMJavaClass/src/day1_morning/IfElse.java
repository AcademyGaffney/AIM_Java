package day1_morning;

public class IfElse {
	public static void main(String[] args) {
		int score = 84;
		if (score >= 85) {
			System.out.println("I Passed!");
		} else if (score >= 75) {
			System.out.println("I barely passed.");
		} else {
			System.out.println("I failed...");
		}

		int num = 1;
		while (num <= 10) {

			System.out.println(num + " x 2 = " + doubler(num));
			num = num + 1;
		}

	}

	public static int doubler(int in) {
		return in * 2;
	}
}
