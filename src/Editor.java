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

public class Editor {

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

	/*Delete string (D). In this method, you will prompt for the index where you want to start deleting a string. You
	will also prompt for the index of the characters one past the last location to delete. Then use a standard
	StringBuilder method to help you complete the task and output the updated string. If a user type in an index that
	is longer than the length of your lineEditor, an exception will occur. Handle this exception by using “try and
	catch” clauses. Also, output the error message that the exception returns. In addition to that,
	output another message to explain that the segment of string has not been deleted due to error.  Hint: Read your
	textbook to find out which type of exception will occur and handle it. Look for clues in Common Programming Error
	box.*/
	public StringBuilder deleteString(StringBuilder inString) {

	}

}
