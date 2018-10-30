import java.util.Scanner;
public class OwnEx {
	public static void main(String[] args) {
		
		if (args.length > 2 ) {
			System.out.println("You enter more than two parameters. Bye!");
		}
		else if (args.length < 2) {
			System.out.println("You enter less than two parameters. Bye!");
		}
		else {
			System.out.println("Welcome " + args[0] + " " + args[1] + "!");
		
		
		// I create a variables for different whiles.
		int wh = 0;
		
		// Now I call Scanner, to enter different numbers around all the exercise.
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Choose your option please:");
			
			// A while to repeat the exercise.
			while (wh != 1) {
			System.out.println("Press 1 to enter a word and compunter tells you the number of all letters are in a telephone and the sum of all the numbers.");
			System.out.println("Press 2 to enter a word and computer tells you first & last letter are vocals or consonants.");
			System.out.println("Press 3 to enter a decimal number and computer tells you in binary, octal, hexadecimal or in all the types.");
			System.out.println("If you want to exit press another number.");
			
			// I create a variable with Scanner, to work with Switch.
			int sw = sc.nextInt();
			
			// I use Switch to select different options
			switch(sw) {
			
				case 1: 
					
					// The program asks a word and you will enter with Scanner
					System.out.println("Enter a word:");
					String teword = sc.next();
					
					// Variables for calculate the letters number and the sum of the numbers
					int number = 0;
					int total = 0;

					// With split, the program put the word in a string array.
					String[] arword = teword.split(" ");
					
					// The program go position to position checking the letters,
					// checking what number they are and summing the total. 
					for (int i = 0; i < arword.length; i++) {
						
        				if (arword[i] == "a" || arword[i] == "b" || arword[i] == "c" ) {
        					number = 2;
        					System.out.println(i + " poition letters number is: " + number);
        					total = total + number;
        				}
        				else if (arword[i] == "d" || arword[i] == "e" || arword[i] == "f" ) {
            				number = 3;
            				System.out.println(i + " poition letters number is: " + number);
            				total = total + number;
            			}
        				else if (arword[i] == "g" || arword[i] == "h" || arword[i] == "i" ) {
            				number = 4;
            				System.out.println(i + " poition letters number is: " + number);
            				total = total + number;
            			}
        				else if (arword[i] == "j" || arword[i] == "k" || arword[i] == "l" ) {
            				number = 5;
            				System.out.println(i + " poition letters number is: " + number);
            				total = total + number;
            			}
        				else if (arword[i] == "m" || arword[i] == "n" || arword[i] == "ñ" || arword[i] == "o" ) {
            				number = 6;
            				System.out.println(i + " poition letters number is: " + number);
            				total = total + number;
            			}
        				else if (arword[i] == "p" || arword[i] == "q" || arword[i] == "r" || arword[i] == "s" ) {
            				number = 7;
            				System.out.println(i + " poition letters number is: " + number);
            				total = total + number;
            			}
        				else if (arword[i] == "t" || arword[i] == "u" || arword[i] == "v" ) {
            				number = 8;
            				System.out.println(i + " poition letters number is: " + number);
            				total = total + number;
            			}
        				else if (arword[i] == "w" || arword[i] == "x" || arword[i] == "y" || arword[i] == "z" ) {
            				number = 9;
            				System.out.println(i + " poition letters number is: " + number);
            				total = total + number;
            			}
        				else {
        					System.out.println("You enter a not valid digit");
        					break;
        				}
					}
					
					// The total
					System.out.println("All letters number sum is: " + total);
					
					// Here, I create a little program to access to another option
            		// without restart the program.
					System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue1 = sc.nextInt();
            		if (continue1 < 1) {
            			wh = 1;
            		}
					break;
					
				case 2: 
					
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
					
					// Here, I create a little program to access to another option
            		// without restart the program.
					System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue2 = sc.nextInt();
            		if (continue2 < 1) {
            			wh = 1;
            		}
					break;
					
				case 3:
					
					// The program asks a number and you will enter with Scanner.
					System.out.println("Enter a decimal number:");
					String decimal = sc.next();
					int deci = Integer.parseInt(decimal);
					
            		// Here I define if number is 0 or negative, it's and error
        			if (deci < 0) {
        				System.out.println("Wrong.");
        				break;
        			}
					
					// The options for a new switch
					System.out.println("What do you want to convert it to?");
					System.out.println("Enter 1 if you want to convert it to binary.");
					System.out.println("Enter 2 if you want to convert it to octal.");
					System.out.println("Enter 3 if you want to convert it to hexadecimal.");
					System.out.println("Enter 0 if you want to convert it to all.");
					
					// I create a variable with Scanner, to work with Switch.
					int select = sc.nextInt();
					
					// I use Switch to select different options
					switch(select) {
						case 0:
							// Binary
					        System.out.println("Binary: " + Integer.toBinaryString(deci));
					        // Octal
					        System.out.println("Octal: " + Integer.toOctalString(deci)); 
					        // Hexadecimal
					        System.out.println("Hexadecimal: " + Integer.toHexString(deci)); 
							break;
							
						case 1:
							// Binary
					        System.out.println("Binary: " + Integer.toBinaryString(deci));
					        break;
					       
						case 2:
							// Octal
					        System.out.println("Octal: " + Integer.toOctalString(deci)); 
					        break;
					        
						case 3:
							// Hexadecimal
					        System.out.println("Hexadecimal: " + Integer.toHexString(deci)); 
							break;
							
						default:
							System.out.println("Wrong");
							break;
					}
					
					// Here, I create a little program to access to another option
            		// without restart the program.
					System.out.println("Do you want to finish or do you want to go to beginning? Enter 0 to finish or another number to continue:");
            		int continue3 = sc.nextInt();
            		if (continue3 < 1) {
            			wh = 1;
            		}
					break;

				default:
					
					// A message to says the option is not valid
            		wh = 1;
					break;
			}
		}
			System.out.println("Thank you! Bye " + args[0] + "!");	
		}
	}
}