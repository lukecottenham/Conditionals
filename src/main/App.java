package main;

public class App {

	public static int booleanMaths(int number1, int number2, boolean bool) {
		int result;
		if (bool) {
			result = number1 + number2;
		} else {
			result = number1 * number2;
		}

		return result;
	}

	public static void main(String[] args) {
		int number1 = 500;
		int number2 = 1;
		boolean bool = false;
		System.out.println(booleanMaths(number1, number2, bool));
	}

}
