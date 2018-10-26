import java.util.Scanner;
public class OwnEx {
	public static void main(String args[]) {
		
		// I create a variables for different whiles.
		int wh00 = 0;
		
		// Now I call Scanner, to enter different numbers around all the exercise.
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Welcome! Choose your option please:");
			
			// A while to repeat the exercise.
			while (wh00 != 1) {
			System.out.println("Press 1 to .");
			System.out.println("Press 2 to enter a word and computers tell you first & last letter are vocals or consonants.");
			System.out.println("If you want to exit press another number.");
			
			// I create a variable with Scanner, to work with Switch.
			int sw = sc.nextInt();
			
			// I use Switch to select different options
			switch(sw) {
			
				case 1: // Transform a decimal number in binary, octal, hexadecimal or the 3 cases.
					
					// The program asks a positive number and you will enter with Scanner
					System.out.println("Enter a number:");
					int numero = sc.nextInt();
					
					String binario = "";
			        if (numero > 0) {
			            while (numero > 0) {
			                if (numero % 2 == 0) {
			                    binario = "0" + binario;
			                } else {
			                    binario = "1" + binario;
			                }
			                numero = (int) numero / 2;
			            }
			        } else if (numero == 0) {
			            binario = "0";
			        } else {
			            binario = "No se pudo convertir el numero. Ingrese solo números positivos";
			        }
			        System.out.println("El número convertido a binario es: " + binario);
					
					
					break;

					
				case 2: // Check if the first and last letter of a word, are vocals or consonants.
					
					// The program asks a word and you will enter with Scanner.
					System.out.println("Enter a word:");
					String word = sc.next();
					
					// With split, the program put the word in a string array.
					String[] characters = word.split(" ");
					
					// The program go position to position checking the first & last letter.
					for (int i = 0; i < characters.length; i++) {
						
						// If the word starts with a vocal, the program says its a vocal, if its not a vocal, it says its a consonant.
						if (characters[i].startsWith("a")) {
							System.out.println("The first letter is a vocal");
						}
						else if (characters[i].startsWith("e")) {
							System.out.println("The first letter is a vocal");
						}
						else if (characters[i].startsWith("i")) {
							System.out.println("The first letter is a vocal");
						}
						else if (characters[i].startsWith("o")) {
							System.out.println("The first letter is a vocal");
						}
						else if (characters[i].startsWith("u")) {
							System.out.println("The first letter is a vocal");
						}
						else {
							System.out.println("The first letter is a consonant");
						}
						
						// If the word ends with a vocal, the program says its a vocal, if its not a vocal, it says its a consonant.
						if (characters[i].endsWith("a")) {
							System.out.println("The last letter is a vocal");
						}
						else if (characters[i].endsWith("e")) {
							System.out.println("The last letter is a vocal");
						}
						else if (characters[i].endsWith("i")) {
							System.out.println("The last letter is a vocal");
						}
						else if (characters[i].endsWith("o")) {
							System.out.println("The last letter is a vocal");
						}
						else if (characters[i].endsWith("u")) {
							System.out.println("The last letter is a vocal");
						}
						else {
							System.out.println("The last letter is a consonant");
						}
					}
					
					
					break;
				default:
					break;
			}
		}
	}
}