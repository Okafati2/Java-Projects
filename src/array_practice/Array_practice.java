package array_practice;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Array_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Welcome the user to the program
		System.out.println("This program takes a string and returns the amount of letters in said string");
		System.out.print("Enter said string: ");
		Scanner sc = new Scanner (System.in);
		String scanned = sc.nextLine();
		//Replace all spaces
		String scanned1 = scanned.replaceAll("\\s","");
		//Creates the array of letters (using .toCharArray())
		char[] ch = scanned1.toCharArray();
		int ch_length = ch.length;
				
		//Print the length of the array
		for (int i = 1; i <= ch_length; i++)
		{
			System.out.print(i);
		}
		System.out.print("\n");
		
		//Print the array elements
		System.out.print("Char Array: [");
		for (char c : ch)
		{
			System.out.print("'" + c + "'" );
		}
		System.out.print("]" + "\n");
		
		//Create the Map
		Map m = new HashMap();
		m.put("kevin",4);
		System.out.print(m);
		
		


	}


}
