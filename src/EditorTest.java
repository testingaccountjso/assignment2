import java.util.Scanner;

public class EditorTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		char charChoice;
		int exit = 0;

		StringBuilder sbObject = new StringBuilder("Mary had a little lamb, Little lamb, little lamb!");
		Editor editor = new Editor(sbObject.toString());

		do {
			System.out.print("\nWelcome to My Line Editor\n=========================\n\nYour current string is : " +
					                 editor.getLineEditor() + "\n\nS - Change String\nD - Delete String\nU - Set " +
					                 "Upper" +
					                 " Case\nC - Count words\nX - To eXit the program\n\nPlease enter your choice : "
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
					break;
				default:
					System.out.print("Invalid input! Please re-enter or type in 'X' to eXit!");
					break;
			}
		} while (exit == 0);
	}
}
