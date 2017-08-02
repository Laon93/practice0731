package practice0731_2;

import java.util.Scanner;

public class practice01 {

	/*
	 * 키보드에서 정수로 된 돈의 액수를 입력 받아 오만 원권, 만원 권, 오천 원권, 천원 권, 500원 동전, 100원 동전, 50원 동전,
	 * 10원 동전, 1원 동전 각 몇 개로 변환 되는지 작성하시오.
	 */
	public static void main(String[] args) {
		System.out.print("금액 : ");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		sc.close();

		int[] count = new int[10];
		int money = 50000;
		for (int i = 0;; i++) {
			if (amount != 0) {
				count[i] = amount / money;
				amount -= money * count[i];
				System.out.println(money + "원 : " + count[i]);

				if (i % 2 == 0)
					money = money / 5;
				else
					money = money / 2;
			}
		}
	}
}
