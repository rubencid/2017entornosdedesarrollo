
	import java.util.Scanner;

	public class GITHUB {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.print("Target: ");
			double balance = 100;
			double target = in.nextDouble();
			double rate = 0.01;
			int year = 0;
			while (balance < target) {
				double interest = balance * rate;
				balance = balance + interest;
				year++;
				System.out.printf("Year %d: %8.2f\n", year, balance);
			}

	}
}
