package basicLevel1010;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);

		boolean isHaveOutPut = false;
		
		while(input.hasNext()){
			int a = input.nextInt();
			int b = input.nextInt();
			
			if(a * b !=0){
				if(isHaveOutPut){
					System.out.print(" ");
				}
				else
					isHaveOutPut = true;
				
				System.out.print(a * b + " " + (b - 1));
				
			}
			 
			
		}
		input.close();
		if(!isHaveOutPut){
			System.out.print("0 0");
			
		}
		
	}

}
