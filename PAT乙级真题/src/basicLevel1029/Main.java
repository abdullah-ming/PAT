package basicLevel1029;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		Scanner input = new Scanner(System.in);
		String str1 = input.nextLine();
		String str2 = input.nextLine();
		
		input.close();
		
		StringBuilder bad = new StringBuilder();
		
		for(int i = 0;i < str1.length();i++){
			if(str2.indexOf(str1.charAt(i)) == -1 && bad.indexOf(String.valueOf(Character.toUpperCase(str1.charAt(i)))) == -1){//保证键盘只输入一遍，保证每个坏键只输入一次
				bad.append(Character.toUpperCase(str1.charAt(i)));
			}
		}
		System.out.print(bad);
 	}

}
