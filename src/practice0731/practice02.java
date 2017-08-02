package practice0731;
//시간되면 변수 두개로 해보기
public class practice02 {

	public static void main(String[] args) {

		// 1 2 3 4 5 6 7 8 9 10
		// 2 3 4 5 6 7 8 9 10 11
		// ...
		// 9 10 11 12 13 14 15 16 17 18
		// 이렇게 출력되도록

		for (int i = 1; i < 10; i++) {
			int k = i;
			for (int j = 1; j<=10; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println("");
		}
	}

}
