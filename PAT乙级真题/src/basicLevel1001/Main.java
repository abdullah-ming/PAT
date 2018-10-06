package basicLevel1001;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in); 
		int a = 0;
		a = in.nextInt();
		
		int num = 0;
		
		while(a != 1)
		{
			if(a % 2 == 0)
			{
				a = a/2;
				num += 1;
			}
			else if(a % 2 == 1)
			{
				a = (3 * a + 1) / 2;
				num += 1;
			}
			
			else break;
		}
		System.out.println(num);
	}

}
