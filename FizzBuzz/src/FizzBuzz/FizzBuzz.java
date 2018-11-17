package FizzBuzz;

public class FizzBuzz {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			/*
			 * int mod3 = i % 3; int mod5 = i % 5; if (mod3 == 0 && mod5 == 0) {
			 * System.out.println("FizzBuzz"); } else if (mod3 == 0) {
			 * System.out.println("Fizz"); } else if (mod5 == 0) {
			 * System.out.println("Buzz"); } else { System.out.println(i); }
			 */
			String mod = "";

			mod = (i % 3 == 0 && i % 5 == 0) ? "35" : (i % 3 == 0) ? "3" : (i % 5 == 0) ? "5" : "";

			switch (mod) {
			case "3":
				System.out.println("Fizz");
				break;
			case "5":
				System.out.println("Buzz");
				break;
			case "35":
				System.out.println("FizzBuzz");
			default:
				System.out.println(i);
				break;
			}
		}
	}
}
