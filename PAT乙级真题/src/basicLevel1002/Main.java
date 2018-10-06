package basicLevel1002;

import java.util.Scanner;
import java.util.Stack;


public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int sum = 0;
		for(int i = 0;i<str.length();i++)
		{
			sum += str.charAt(i) - '0';
		}
		Stack<String> stack = new Stack<>();
		while(sum!=0)
		{
			int unit = sum % 10;
			switch (unit) {
			case 0:
				stack.push("ling");
				break;
			case 1:
				stack.push("yi");
				break;
			case 2:
				stack.push("er");
				break;
			case 3:
				stack.push("san");
				break;
			case 4:
				stack.push("si");
				break;
			case 5:
				stack.push("wu");
				break;
			case 6:
				stack.push("liu");
				break;
			case 7:
				stack.push("qi");
				break;
			case 8:
				stack.push("ba");
				break;
			case 9:
				stack.push("jiu");
				break;
			case 10:
				stack.push("shi");
				break;
			default:
				break;
			}
			sum = sum / 10;
		}
		System.out.print(stack.pop());
		while(!stack.isEmpty())
			System.out.print(" "+stack.pop());
	}

}
