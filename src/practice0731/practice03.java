package practice0731;

import java.util.Scanner;

public class practice03 {

/*	a. 입력 받은 숫자가 홀수인 경우에는, 0 부터 입력 값까지 홀수의 합을 출력합니다.
	- 예제 : 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 ) 
	b. 입력 받은 숫자가 짝수인 경우에는, 0 부터 입력 값까지 짝수의 합을 출력합니다.
	    - 예제 : 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30 )
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		if(num%2 == 0)
		{
			for(int i=1; 2*i <= num; i ++)
				sum += 2*i;
		}
		else 
			for(int i=1; 2*i - 1 <= num; i++)
				sum += 2*i - 1;
		
		System.out.println(sum);
	}

}
