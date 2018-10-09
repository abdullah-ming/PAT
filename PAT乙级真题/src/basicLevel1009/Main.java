package basicLevel1009;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		
		String str = input.nextLine();
		
		input.close();
		
		String[] strin = str.split(" ");
		Stack<String> stack = new Stack<>();
		
		for(String stri:strin){
			stack.push(stri);

		}

		System.out.print(stack.pop());
		while(!stack.isEmpty()){
			System.out.print(" " + stack.pop());
		}
	}

}
