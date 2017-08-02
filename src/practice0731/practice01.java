package practice0731;

import java.util.*;

public class practice01 {

	public static void main(String[] args) {
		
		//java.util.Scanner 를 이용하여 3의 배수인지 확인하기
		
		System.out.print("수를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i%3 == 0)
			System.out.println("3의 배수입니다.");
		else 
			System.out.println("3의 배수가 아닙니다.");
		
		sc.close();
	}

}
