import java.util.Scanner;
public class OwnEx {
	public static void main(String args[]) {
		
		// I create a variables for different whiles.
		int wh00 = 0;
		
		// Now I call Scanner, to enter different numbers around all the exercise.
		Scanner sc = new Scanner(System.in);
		
		// A while to repeat the exercise.
		while (wh00 != 1) {
			System.out.println("Welcome! Choose your option please:");
			System.out.println("Press 1 to .");
			System.out.println("Press 2 to .");
			System.out.println("If you want to exit press another number.");
			
			// I create a variable with Scanner, to work with Switch.
			int sw00 = sc.nextInt();
			
			// I use Switch to select different options
			switch(sw00) {
				case 1:
					// Pasar un número decimal a binario o hexadecimal.
					break;
				case 2:
					// Check if the first and last letter of a word, are vocals or consonants.
					System.out.println("Enter a word:");
					String sta2 = sc.next();
					break;
				default:
					break;
			}
		}
	}
}