/**
 * Created with IntelliJ IDEA.
 * User: Jonathan
 * Date: 10/20/13
 * Time: 1:05 PM
 * To change this template use File | Settings | File Templates.
 *
 * Your Editor class will have a private StringBuilder instance variable called lineEditor.
 * You should have at least one constructor with one parameter. This constructor will take in a string.
 * Inside the constructor, you will instantiate a StringBuilder object with that string.
 * (Please follow the instructions in this section carefully.)
 * Besides that, you should also write a setLineEditor that will set
 * the StringBuilder variable to a new StringBuilder object and
 * getLineEditor method that will return the content of lineEditor.
 * You will then write the three methods listed above for each of the tasks that Editor can perform.
 *
 */

package edu.utsa.assignmenttwo;

import java.util.Scanner;

public class Editor {

	private static Scanner input = new Scanner(System.in);
	private StringBuilder lineEditor;

	public Editor(String inString) {
		lineEditor = new StringBuilder(inString);
	}

	public StringBuilder getLineEditor() {
		return lineEditor;
	}

	public void setLineEditor(StringBuilder lineEditor) {
		this.lineEditor = lineEditor;
	}


	public void deleteString() throws StringIndexOutOfBoundsException {

		StringBuilder beforeDelete = getLineEditor();

		try {
			System.out.println("\nPlease enter the index to delete the string: ");
			int begIndex = input.nextInt();

			System.out.println("Please enter the index one past the last character of string to be deleted: ");
			int endIndex = input.nextInt();

			if (begIndex < 0 || begIndex > endIndex || endIndex > beforeDelete.length()) {
				throw new StringIndexOutOfBoundsException();
			}
			else {
				beforeDelete.delete(begIndex, endIndex);
				setLineEditor(beforeDelete);
			}
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e + "\nThe segment of string is not deleted due to error!");
		}
	}

	public void setUpperCase() throws StringIndexOutOfBoundsException {

		StringBuilder beforeCase = getLineEditor();

		try {
			System.out.println("\nPlease enter the index of the string to convert to upper case: ");
			int replaceIndex = input.nextInt();

			if (replaceIndex < 0 || replaceIndex > beforeCase.length()) {
				throw new StringIndexOutOfBoundsException();
			}
			else if (Character.isLowerCase(replaceIndex)) {
				beforeCase.replace(replaceIndex, replaceIndex,
				                   Character.toString(Character.toUpperCase(beforeCase.charAt(replaceIndex)))
				                  );
				System.out.println("Updated Line Editor = " + beforeCase);
				setLineEditor(beforeCase);
			}
			else {
				System.out.println("The character at the specified location is already in upper case, " +
						                   "no conversion is done"
				                  );
			}
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e + "\nThe segment of string is not deleted due to error!");
		}
	}


	public void countWords() {

		StringBuilder beforeCount = getLineEditor();

		System.out.println("\nPlease enter the target string: ");
		String targetWord = input.nextLine();

		String[] result = beforeCount.toString().split("\\s");

		int foundTargetWord = 0;

		for (int i = 0; i < result.length; i++) {
			if (targetWord.matches(result[i])) {
				foundTargetWord++;
			}
		}

		if (foundTargetWord > 0) {
			System.out.println("The target word " + targetWord + " appears " + foundTargetWord + " times in " +
					                   beforeCount
			                  );
		}
		else {
			System.out.println("The target word " + targetWord + " is not in " + beforeCount);
		}
	}


}
