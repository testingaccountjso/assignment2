/**
 * Created with IntelliJ IDEA.
 * User: Jonathan
 * Date: 10/20/13
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

			System.out.print("\nPlease enter the index one past the last character of string to be deleted: ");
			int endIndex = input.nextInt();

			deleteStr.delete(begIndex, endIndex);
			setLineEditor(deleteStr);
			System.out.print("\nUpdated Line Editor = " + getLineEditor() + "\n");
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("\n" + e + "\nThe segment of string is not deleted due to error!");
		}
	}


	public void setUpperCase() throws StringIndexOutOfBoundsException {

		StringBuilder upperString = getLineEditor();

		try {
			System.out.print("\nPlease enter the index of the string to convert to upper case: ");
			int replaceIndex = input.nextInt();
			input.nextLine();
			char testCase = upperString.charAt(replaceIndex);

			if (Character.isLowerCase(testCase)) {
				upperString.replace(replaceIndex, replaceIndex + 1,
				                    Character.toString(Character.toUpperCase(upperString.charAt(replaceIndex)))
				                   );
				System.out.println("\nUpdated Line Editor = " + upperString + "\n");
				setLineEditor(upperString);
			}
			else {
				System.out.println("\nThe character at the specified location is already in upper case, " +
						                   "no conversion is done."
				                  );
			}
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("\n" + e + "\nThe character is not converted due to error!");
		}
	}


	public void countWords() {

		StringBuilder countString = getLineEditor();

		System.out.print("\nPlease enter the target string: ");
		String targetWord = input.nextLine();

		Pattern pattern = Pattern.compile(targetWord);
		Matcher matcher = pattern.matcher(countString);

		int foundTargetWord = 0;
		while (matcher.find()) {
			foundTargetWord++;
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
