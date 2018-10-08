package basicLevel1006;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		if(a<1000){
			Stack<String> stack = new Stack<>();
			
			int a1,a2,a3;
			a1 = a%10;
			while(a1!=0){
	
				stack.push(String.valueOf(a1));
				a1--;
			}
			
			a2 = a/10%10;
			while(a2!=0){
				stack.push("S");
				a2--;
			}
			a3 = a/100%10;
			while(a3!=0){
				stack.push("B");
				a3--;
			}

			while(!stack.isEmpty())
				System.out.print(stack.pop());
		}
	}

}
