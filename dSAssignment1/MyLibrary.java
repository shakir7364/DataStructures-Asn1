package dSAssignment1;

import java.util.Scanner;
public class MyLibrary<T>
{
	//Display row of desired amount of characters
	public static String displayRowOfCharacters(char a, int b)
	{
		String row = "";
		if(b < 1)
			return "Bad integer input";
		if(b == 1)
			return row += a;
		else
			row = a + displayRowOfCharacters(a, (b - 1));
		return row;
	}
	
	//Recursively get user to input an int between 1 and 10
	public static int getUserInput()
	{
		Scanner in = new Scanner(System.in);
		int input = 0;
		
		System.out.println("Please enter an integer between 1 and 10(inclusive): ");
		input = in.nextInt();
		
		if(input < 1 || input > 10)
			input = getUserInput();
		return input;
	}
	
	//Recursively print out a reversed array
	public static <T> void RevArray(T c[])
	{
		if(c.length < 1)
			System.out.println("Array is empty");
		else
		{
			Object[] temp = new Object[c.length - 1];
			if(c.length == 1)
				System.out.print(c[0] + " ");
			else
			{
				System.out.print(c[c.length - 1] + " ");
				for(int i = 0; i < temp.length; i++)
					temp[i] = c[i];
				RevArray(temp);
			}
		}
	}
	
	//Recursively print out a reversed string
	public static void RevString(String s)
	{
		if(s.isEmpty())
		{
			System.out.println("Empty string entered.");
			return;
		}
		if(s.length() == 1)
			System.out.print(s.charAt(0));
		else
		{
			System.out.print(s.charAt(s.length() - 1));
			RevString(s.substring(0, (s.length() - 1)));
		}
	}
}
