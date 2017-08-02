package practice0731;

public class practice05_1 {

	
	public static void main(String[] args) {
		
		//valueOf()
		//charAt(i)
		String num;
		
		
		for(int i =1 ; i < 1000; i++)
		{
			int count=0;
			num = String.valueOf(i);
			
			for(int j = 0; j<num.length(); j++)
			{
				char check = num.charAt(j);
				if(check == '3' || check == '6' || check == '9')
					count++;
			}
			if(count!=0)
			{
				System.out.print(num + "     " );
				for(int j = 0; j<count; j++)
					System.out.print("짝");
				System.out.println("");
			}
			
		}
	}

}
