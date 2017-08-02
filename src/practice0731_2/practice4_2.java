package practice0731_2;

import java.util.Scanner;

public class practice4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char[] reverseStr = reverse(str);
		printCharArray(reverseStr);
	}
	
	public static char[] reverse(String str)
	{
		int count = str.length()/2;
		char[] reverseStr = str.toCharArray();
		
		for(int i = 0 ; i < count; i ++)
		{
			char temp = reverseStr[i];
			reverseStr[i] = reverseStr[reverseStr.length - i-1];
			reverseStr[reverseStr.length - i - 1] = temp;
		}
		
		return reverseStr;
	}
	
	public static void printCharArray(char[] array)
	{
		for(int i = 0; i< array.length; i++)
			System.out.print(array[i]);
	}

}
