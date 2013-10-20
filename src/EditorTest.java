package edu.utsa.assignmenttwo;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA. User: Jonathan Date: 10/20/13 Time: 4:35 PM To change this template use File | Settings |
 * File Templates.
 */
public class EditorTest {

	private static StringBuilder sbObject = new StringBuilder("Mary had a little lamb, Little lamb, little lamb!");

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		char charChoice;


		do {
			System.out.print("\n\nWelcome to My Line Editor\n=======================\n\nYour current string is : " +
					                 sbObject + "\n\nS - Change String\nD - Delete String\nU - Set Upper Case\nC - " +
					                 "Count words\nX - To eXit the program\n\nPlease enter your choice : "
			                );
			String stringChoice = input.nextLine();
			charChoice = stringChoice.toUpperCase().charAt(0);

			switch (charChoice) {
				case 'S':
					System.out.print("Please enter a new string : ");
					String newString = input.nextLine();
					sbObject.setLineEditor();


				case 'D':


				case 'U':

				case 'C':

				case 'X':

			}

		} while (charChoice != 'x');
	}
}
