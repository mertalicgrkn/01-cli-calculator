import java.util.Scanner;

public class CliCalculator {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean isValidOperation = true;
		double result = 0;

		System.out.print("Enter the first number: ");
		double firstNumber = scanner.nextDouble();

		System.out.print("Enter the second number: ");
		double secondNumber = scanner.nextDouble();

		System.out.print("Enter an operation (+, -, *, /, %): ");
		String operator = scanner.next();

		scanner.close();

		switch (operator) {

		case "+":
			result = firstNumber + secondNumber;
			break;

		case "-":
			result = firstNumber - secondNumber;
			break;

		case "*":
			result = firstNumber * secondNumber;
			break;

		case "/":
			if (secondNumber == 0) {
				System.out.println("Cannot divide by zero.");
				isValidOperation = false;
			} else {
				result = firstNumber / secondNumber;
			}
			break;

		case "%":
			if (secondNumber == 0) {
				System.out.println("Cannot divide by zero.");
				isValidOperation = false;
			} else {
				result = firstNumber % secondNumber;
			}
			break;

		default:
			System.out.println("Please enter an allowed operator (+, -, *, /, %)");
			isValidOperation = false;
			break;

		}

		if (isValidOperation) {
			System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);
		}

	}
}
