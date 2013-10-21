/**
 * Created with IntelliJ IDEA.
 * User: Jonathan
 * Date: 10/20/13
 */

import java.util.Scanner;

public class Editor {

	private Scanner input = new Scanner(System.in);
	private StringBuilder lineEditor;

	public Editor(String inString) {
		lineEditor = new StringBuilder(inString);
	}

	public StringBuilder getLineEditor() {
		return lineEditor;
	}

	public void setLineEditor(StringBuilder lineEditor) {
		this.lineEditor = new StringBuilder(lineEditor);
	}


	public void deleteString() throws StringIndexOutOfBoundsException {

		StringBuilder deleteStr = getLineEditor();

		try {
			System.out.print("\nPlease enter the index to delete the string: ");
			int begIndex = input.nextInt();

			System.out.print("Please enter the index one past the last character of string to be deleted: ");
			int endIndex = input.nextInt();

			if (begIndex < 0 || begIndex > endIndex || endIndex > deleteStr.length()) {
				throw new StringIndexOutOfBoundsException();
			}
			else {
				deleteStr.delete(begIndex, endIndex);
				setLineEditor(deleteStr);
			}
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e + "\nThe segment of string is not deleted due to error!");
		}
	}


	public void setUpperCase() throws StringIndexOutOfBoundsException {

		StringBuilder upperString = getLineEditor();

		System.out.print("\nPlease enter the index of the string to convert to upper case: ");
		int replaceIndex = input.nextInt();
		input.nextLine();

		try {
			if (replaceIndex < 0 || replaceIndex > upperString.length()) {
				throw new StringIndexOutOfBoundsException();
			}
			else if (Character.isLowerCase(replaceIndex)) {
				upperString.replace(replaceIndex, replaceIndex,
				                    Character.toString(Character.toUpperCase(upperString.charAt(replaceIndex)))
				                   );
				System.out.println("Updated Line Editor = " + upperString);
				setLineEditor(upperString);
			}
			else {
				System.out.println("The character at the specified location is already in upper case, " +
						                   "no conversion is done"
				                  );
			}
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("\n" + e + "\nThe character is not converted due to error!");
		}
	}


	public void countWords() {

		System.out.print("\nPlease enter the target string: ");
		String targetWord = input.nextLine();

		StringBuilder countString = getLineEditor();
		String[] result = countString.toString().split("\\s");

		int foundTargetWord = 0;
		for (int i = 0; i < result.length; i++) {
			if (targetWord.equalsIgnoreCase(result[i])) {
				foundTargetWord++;
			}
		}

		if (foundTargetWord > 0) {
			System.out.println("\nThe target word " + targetWord + " appears " + foundTargetWord + " times in " +
					                   countString
			                  );
		}
		else {
			System.out.println("\nThe target word " + targetWord + " is not in " + countString);
		}
	}
}
