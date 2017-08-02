package practice0731;

public class practice05 {
	/*
	 * 반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우의 수를 순서대로 화면에 출력해보세요. 1부터 99까지만 실행하세요.
	 * 두번 나올때에는 짝짝
	 */

	public static void main(String[] args) {

		//a.concat(string)
		//a.compareTo(string)
		//a.matches("");
		for(Integer i =1; i<100; i++)
		{
			String str = i.toString();
			
			if(str.matches("3") || str.matches("6") || (str.matches("9")))
			{
				str = str.concat("      짝");
				System.out.println(str);
			}
			else if(str.matches("(.*)3")&&str.matches("3(.*)")||str.matches("6(.*)")&&str.matches("(.*)6")||str.matches("9(.*)")&&str.matches("(.*)9"))
			{
				str = str.concat("     짝짝");
				System.out.println(str);
			}
			else if(str.matches("(.*)3(.*)")||str.matches("(.*)6(.*)")||str.matches("(.*)9(.*)"))
			{
				str = str.concat("     짝");
				System.out.println(str);
			}
			
		}

	}

}
