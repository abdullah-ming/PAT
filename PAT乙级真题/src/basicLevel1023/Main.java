package basicLevel1023;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner in = new Scanner(System.in);
		int[] times = new int[10];
		for (int i = 0; i < 10; i++) {
			times[i] = in.nextInt();
		}
		in.close();
		
		StringBuilder s = new StringBuilder();
		
		for(int i = 1;i < 10;i ++){
			if(times[i] != 0){
				s.append(i);
				times[i]--;
				break;
			}
		}
		for(int i = 0;i <10;i ++){
			while(times[i]!=0){
				s.append(i);
				times[i]--;
			}
		}
		System.out.print(s);
	}

}
