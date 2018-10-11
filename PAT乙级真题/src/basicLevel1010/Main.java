package basicLevel1010;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input1 = new Scanner(System.in);

		boolean isHaveOutPut = false;
		
		while(input1.hasNext()){
			int a = input1.nextInt();
			int b = input1.nextInt();
			
			if(a * b !=0){
				if(isHaveOutPut){
					System.out.print(" ");
				}
				else
					isHaveOutPut = true;
				
				System.out.print(a * b + " " + (b - 1));
				
			}
			 
			
		}
		input1.close();
		if(!isHaveOutPut){
			System.out.print("0 0");
			
		}
	}

}
