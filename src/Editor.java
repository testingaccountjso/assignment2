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

	private static Scanner       input = new Scanner;
	private static StringBuilder lineEditor;

	public Editor(String inString) {
		lineEditor = new StringBuilder(inString);
	}

	public StringBuilder getLineEditor() {
		return lineEditor;
	}

	public void setLineEditor(StringBuilder lineEditor) {
		this.lineEditor = lineEditor;
	}

	/*Delete string (D). In this method, you will prompt for the index where you want to start deleting a string. You
	will also prompt for the index of the characters one past the last location to delete. Then use a standard
	StringBuilder method to help you complete the task and output the updated string. If a user type in an index that
	is longer than the length of your lineEditor, an exception will occur. Handle this exception by using “try and
	catch” clauses. Also, output the error message that the exception returns. In addition to that,
	output another message to explain that the segment of string has not been deleted due to error.  Hint: Read your
	textbook to find out which type of exception will occur and handle it. Look for clues in Common Programming Error
	box.*/
	public void deleteString() throws StringIndexOutOfBoundsException {

		StringBuilder beforeDelete = getLineEditor();

		try {
			System.out.println("Please enter the index to delete the string: ");
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

	/*Set Upper Case (U). In this method, you will first prompt for the index of the character that you want to
	convert to upper case. You can make the assumption that the character will be within a-z or A-Z (the input will be
	 a valid letter). You will have to check the character at the index to make sure that it is still in lower case.
	 If that is the case, you will convert the lower case character to a upper case character and output the updated
	 string. Otherwise, output a statement explaining that “The letter is already in upper case and no conversion is
	 conducted.”  Hint: use methods from Character Class to assist you. Also,
	 use the appropriate built-in StringBuilder method(s) to help you too. If a user type in an index that is longer
	 than the length of your lineEditor, an exception will occur. Handle this exception by using “try and catch”
	 clauses. Also, output the error message that the exception returns. In addition,
	 output another message to explain that the lineEditor has not been updated due to error.  Hint: Read your
	 textbook to find out which type of exception will occur and handle it. Look for clues in Common Programming Error
	  box.*/
	public void setUpperCase() throws StringIndexOutOfBoundsException {

		StringBuilder beforeCase = getLineEditor();

		try
		{
		System.out.println("Please enter the index of the string to convert to upper case: ");
		int replaceIndex = input.nextInt();

		if (replaceIndex < 0 || replaceIndex > beforeCase.length()) {
			throw new StringIndexOutOfBoundsException();
		}
		else if (Character.isLowerCase(replaceIndex)) {
			beforeCase.replace(replaceIndex, replaceIndex,
			                   Character.toString(Character.toUpperCase(beforeCase.charAt(replaceIndex))));
			System.out.println("Updated Line Editor = " + beforeCase);
			setLineEditor(beforeCase);
		}
			else {
			System.out.println("The character at the specified location is already in upper case, " +
					                   "no conversion is done");
		}
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e + "\nThe segment of string is not deleted due to error!");
		}


}
