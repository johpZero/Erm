/**
	File name: L04_P3_4.java
	Short description: Class to satisfy HW.
	IST 140 Assignment:  L04: P3-4
	@author John Mesure
	@version 1.01 2016-09-22
	date of last revision:
	details of the revision: none
*/

import java.util.Scanner;

public class L04_P3_4
{
	public static void main (String[] args)
	{
		// Program description
		System.out.println("This program will take three numbers and\n"
		+ "tell if they're all the same, all different, or neither.\n");

		// Declaring the variables: types and names
		int first, second, third;
		String result;
		Scanner input = new Scanner(System.in);

		// Variable initialization: getting the input from the user
		System.out.print("Enter the first number: ");
		first = input.nextInt();
		System.out.print("Enter the second number: ");
		second = input.nextInt();
		System.out.print("Enter the third number: ");
		third = input.nextInt();

		// Calculations
		if (first == second && second == third)
			result = "all the same";
		else if (first != second && second != third && first != third)
			result = "all different";
		else
			result = "neither";

		// Display the results
		System.out.println("\n" + result + "\n");
	}
}

/*

This program will take three numbers and
tell if they're all the same, all different, or neither.

Enter the first number: 5
Enter the second number: 5
Enter the third number: 5

all the same

Press any key to continue . . .
_____________________________________________________

This program will take three numbers and
tell if they're all the same, all different, or neither.

Enter the first number: 5
Enter the second number: 9
Enter the third number: 1248

all different

Press any key to continue . . .
_____________________________________________________

This program will take three numbers and
tell if they're all the same, all different, or neither.

Enter the first number: 4
Enter the second number: 723
Enter the third number: 723

neither

Press any key to continue . . .

*/