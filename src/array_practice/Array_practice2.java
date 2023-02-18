package array_practice;

import java.lang.reflect.Array; 
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Array_practice2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Welcome the user to the program
		System.out.println("This program takes a string and returns the amount of letters in said string");
		System.out.print("Enter said string: ");
		
		//Create the Hashmap
		Map m = new HashMap();
		Scanner sc = new Scanner (System.in);
		String scanned = sc.nextLine();
		
		//Looping through the chars
		for(char x:scanned.toCharArray())
		{
			if(m.containsKey(x))
			{
				int old = (int) m.get(x);
				m.put(x, old+1);
			}
			else 
			{
				m.put(x,1); 
			}
		}
		m.remove(' ');
		System.out.println(m);

		
}

}