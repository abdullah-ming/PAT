package basicLevel1029;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		Scanner input = new Scanner(System.in);
		String str1 = input.nextLine();
		String str2 = input.nextLine();
		
		input.close();
		
		StringBuilder bad = new StringBuilder();
		
		for(int i = 0;i < str1.length();i++){
			if(str2.indexOf(str1.charAt(i)) == -1 && bad.indexOf(String.valueOf(Character.toUpperCase(str1.charAt(i)))) == -1){//��֤����ֻ����һ�飬��֤ÿ������ֻ����һ��
				bad.append(Character.toUpperCase(str1.charAt(i)));
			}
		}
		System.out.print(bad);
 	}

}
