package practice0731_2;

import java.util.Random;
import java.util.Scanner;

public class practice05 {
	/*
	 * 1-100까지의 임의의 수를 가진 카드를 한 장 숨기고 이 카드의 수를 맞추는 게임 카드 속의 수가 57인 경우를 보면 수를 맞추는 사람이
	 * 40이라고 입력하면 "더 높게", 다시 75이라고 입력하면 "더 낮게" 라는 식으로 범위를 좁혀가며 수를 맞추고 있습니다. 게임을 반복하기
	 * 위해 y/n이라고 묻고 n인 경우 종료됩니다
	 */

	public static void main(String[] args) {

		Random r = new Random();
		int k = r.nextInt(100) + 1;
		int input, max, min;
		max = 100;
		min = 1;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("수를 결정하였습니다. 맞추어 보세요");

			for (int i = 1;; i++) {
				System.out.print(i + " >> ");
				input = sc.nextInt();

				if (k < input) {
					System.out.println("더 낮게");
					max = input;
					System.out.println(min + " - " + max);
				} else if (k > input) {
					System.out.println("더 높게");
					min = input;
					System.out.println(min + " - " + max);
				} else {
					System.out.println("정답입니다!!!");
					break;
				}

			}
			System.out.println("다시하시겠습니까?(y/n)");
			String answer = sc.next();
			if(answer.equals("n")||answer.equals("N"))
				break;
		}
		sc.close();

	}

}
