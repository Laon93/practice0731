package practice0731;

import java.util.Scanner;

public class practice04 {

	/*	문자열을 입력하세요. : Bat Man
		B
		Ba 
		Bat
		Bat 
		Bat M
		Bat Ma
		Bat Man
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("문자열을 입력하세요. : ");
		
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		
		for(int i = 0; i<=st.length(); i++)
		{
			System.out.println(st.subSequence(0, i));
		}

	}

}
