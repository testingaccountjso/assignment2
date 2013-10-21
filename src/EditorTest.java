

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA. User: Jonathan Date: 10/20/13 Time: 4:35 PM To change this template use File | Settings |
 * File Templates.
 */
public class EditorTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char charChoice;
		int exit = 0;

		StringBuilder sbObject = new StringBuilder("Mary had a little lamb, Little lamb, little lamb!");
		Editor editor = new Editor(sbObject.toString());

		do {
			System.out.print("\n\nWelcome to My Line Editor\n=======================\n\nYour current string is : " +
					                 editor + "\n\nS - Change String\nD - Delete String\nU - Set Upper Case\nC - " +
					                 "Count words\nX - To eXit the program\n\nPlease enter your choice : "
			                );
			String stringChoice = input.nextLine();
			charChoice = stringChoice.toUpperCase().charAt(0);

			switch (charChoice) {
				case 'S':
					System.out.print("\nPlease enter a new string : ");
					String newString = input.nextLine();
					editor = new Editor(newString);
					break;

				case 'D':
					editor.deleteString();
					break;

				case 'U':
					editor.setUpperCase();
					break;

				case 'C':
					editor.countWords();
					break;

				case 'X':
					exit = 1;

			}

		} while (exit == 0);
	}
}
