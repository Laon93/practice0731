package practice0731_2;

import java.util.Scanner;

public class practice04 {

	/*문자열(String)을 입력 받아, 해당 문자열을 문자 순서를 뒤집어서 char[]로 반환하는 메소드를 만들고, char[]을 입력 받아 출력하는 메소드를 만드시오.*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		
		char reverseStr[] = reverse(str);
		printCharArray(reverseStr);
		System.out.println("");
		
	}
	
	public static char[] reverse(String str)
	{
		char[] strArray = str.toCharArray(); 
		char[] reverseStr1 = new char[strArray.length];
		char[] reverseStr2 = new char[strArray.length];
		
		//--하는 경우
		for(int i = strArray.length-1; i >= 0; i--)
			reverseStr1[strArray.length-i-1] = strArray[i];
		
		//++하는 경우
		for(int i=0; i< strArray.length; i++)
			reverseStr2[i] = strArray[(strArray.length-i-1)];
		
		return reverseStr1;
		
	}
	
	public static void printCharArray(char[] array)
	{
		System.out.print("reverseStr : ");
		for(int i = 0; i< array.length; i ++)
			System.out.print(array[i]);
	}

}
