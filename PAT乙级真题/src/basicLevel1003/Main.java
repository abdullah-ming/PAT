package basicLevel1003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	Scanner input = new Scanner(System.in);
	int a = input.nextInt();
	input.nextLine();
	String[] s = new String[a];
	
	for(int i = 0 ; i < a ;i++){
		s[i] = new String(input.nextLine());
		
		for (int j = 0; j < s[i].length(); j++) {
			if (s[i].charAt(j) != 'P' && s[i].charAt(j) != 'A' && s[i].charAt(j) != 'T') {
				System.out.println("NO");
				break;
			}
		}

			int p = s[i].indexOf('P');
			int t = s[i].indexOf('T');
			
			if(p > t){
				System.out.println("NO");
				continue;
			}
			
			String a1 = null;
			String b1 = null;
			String c1 = null;
			if(p != -1)
				a1 = s[i].substring(0,p);
			else {
				System.out.println("NO");
				continue;
			}
			if (t != -1) {
				c1 = s[i].substring(t + 1, s[i].length());
			} else {
				System.out.println("NO");
				continue;
			}
			b1 = s[i].substring(p + 1, t);
			if (a1.contains("P") || a1.contains("T") || b1.contains("T") || b1.contains("P") || c1.contains("P")
					|| c1.contains("T")) {
				System.out.println("NO");
				continue;
			}
			if (c1.length() < a1.length()) {

				System.out.println("NO");
				continue;
			}
			if (b1.length() == 0) {
				System.out.println("NO");
				continue;
			}
			if (a1.equals(c1) && a1.equals("")) {
				System.out.println("NO");
				continue;
			}
			int times = 0;
			for (int i1 = 0; i1 <= c1.length() - a1.length(); i1 += a1.length()) {
				if (a1.equals(c1.substring(i1, i1 + a1.length()))) {
					times++;
				}
			}

			if (times == b1.length()) {
				System.out.println("YES");
				continue;
			} else {
				System.out.println("NO");
				continue;
			}
			
	}
	input.close();
}
}
